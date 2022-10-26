package com.example.Configservice.Entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="originatormapping")
public class Mapping {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String originatorName;
    @Column(name = "workflowid")
    private Integer workflowId;

    @Column(name = "mappingfile",columnDefinition="JSON")
    private String mappingfile;

    public Mapping() {
    }

    public Mapping(Integer id, String originatorName, Integer workflowId, String mappingfile) {
        super();
        this.id = id;
        this.originatorName = originatorName;
        this.workflowId = workflowId;
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
        return workflowId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workflowId = workspaceId;
    }

    public String getMappingfile() {
        return mappingfile;
    }

    public void setMappingfile(String mappingfile) {
        this.mappingfile = mappingfile;
    }
}
