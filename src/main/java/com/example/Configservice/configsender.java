package com.example.Configservice;

//import com.fasterxml.jackson.databind.util.JSONPObject;
//import org.apache.tomcat.util.json.JSONParser;
//import org.codehaus.jettison.json.JSONArray;
//import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileReader;

@RestController
public class configsender {

//    @Autowired
//    private MappingRepository mappingRepository;

    @PostMapping("/sendfile")
    public String run(@RequestBody String orgname) throws Exception {
        System.out.println("-------------------");
        System.out.println(orgname);


        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject();
        try {
            Object obj = parser.parse(new FileReader("src/main/resources/static/"+orgname+"mapping.json"));
            jsonObject = (JSONObject)obj;

//            System.out.println(jsonObject);
            System.out.println("\n**************\n\n");
//            System.out.println(jsonObject.toString());
            System.out.println("-------------");

//            String sam = mappingRepository.getMappingfileByName(orgname);
//            System.out.println("message-------->"+sam);

        } catch(Exception e) {
            e.printStackTrace();
        }



        return jsonObject.toString();

    }
}
