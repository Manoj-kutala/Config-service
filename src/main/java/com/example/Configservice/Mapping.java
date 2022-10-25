package com.example.Configservice;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
//import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
//import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.json.simple.JSONObject;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.awt.*;
//import javax.persistence.Id;


@Entity
@Table(name="originatormapping")
//@TypeDefs({
//        @TypeDef(name = "json", typeClass = JsonStringType.class),
//        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
//})
public class Mapping {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String originatorName;
    @Column(name = "workspaceid")
    private Integer workspaceId;

    @Column(name = "mappingfile")
    private String mappingfile;

    public Mapping() {
    }

    public Mapping(Integer id, String originatorName, Integer workspaceId, String mappingfile) {
        super();
        this.id = id;
        this.originatorName = originatorName;
        this.workspaceId = workspaceId;
        this.mappingfile = mappingfile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginatorName() {
        return originatorName;
    }

    public void setOriginatorName(String originatorName) {
        this.originatorName = originatorName;
    }

    public Integer getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getMappingfile() {
        return mappingfile;
    }

    public void setMappingfile(String mappingfile) {
        this.mappingfile = mappingfile;
    }
}
