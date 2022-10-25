package com.example.Configservice.service;

import com.example.Configservice.MappingRepository;
import com.example.sample.request;
import com.example.sample.response;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileReader;

@GrpcService
public class someService extends com.example.sample.sampleGrpc.sampleImplBase{

    @Autowired
    private MappingRepository mappingRepository;
    @Override
    public void func(request request, StreamObserver<response> responseObserver) {

        String orgname = request.getReq();
        System.out.println("-------------------");
        System.out.println(orgname);


        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject();
        String sam = null;
        try {
            Object obj = parser.parse(new FileReader("src/main/resources/static/" + orgname + "mapping.json"));
            jsonObject = (JSONObject) obj;

            System.out.println(jsonObject);
            System.out.println("\n**************\n\n");
            System.out.println(jsonObject.toString());
            sam = mappingRepository.getMappingfileByName(orgname);
            System.out.println("message-------->" + sam);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String s = jsonObject.toString();

        responseObserver.onNext(response.newBuilder().setRes(sam).build());
        responseObserver.onCompleted();
    }
}
