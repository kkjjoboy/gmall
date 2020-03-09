package com.atguigu.gmall.bean;

import javax.persistence.Id;
import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {
    @Id
    private String id;
    private String name;
    private String Catalog2Id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog2Id() {
        return Catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        Catalog2Id = catalog2Id;
    }
}
