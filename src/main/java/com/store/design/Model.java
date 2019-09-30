package com.store.design;

import java.util.Date;

public class Model {
    private String modelName;
    private Date manufacturingDate;

    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }

    public Model(String modelName, Date manufacturingDate) {
        this.modelName = modelName;
        this.manufacturingDate=manufacturingDate;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
