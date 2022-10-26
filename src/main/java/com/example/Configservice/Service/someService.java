package com.example.Configservice.Service;

import com.example.Configservice.Repository.MappingRepository;
import com.example.sample.request;
import com.example.sample.response;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
public class someService extends com.example.sample.sampleGrpc.sampleImplBase{

    @Autowired
    private MappingRepository mappingRepository;

    @Override
    public void func(request request, StreamObserver<response> responseObserver) {

        String orgname = request.getReq();
        System.out.println("-------------------");
        System.out.println(orgname);

        System.out.println("\n**************\n");
        String sam = mappingRepository.getMappingfileByName(orgname);
        System.out.println("mapping file-------->" + sam);


        responseObserver.onNext(response.newBuilder().setRes(sam).build());
        responseObserver.onCompleted();
    }
}
