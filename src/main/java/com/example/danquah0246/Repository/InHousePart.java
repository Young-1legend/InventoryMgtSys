package com.example.danquah0246.Repository;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class InHousePart extends Inventory {



    private final IntegerProperty machineID;
    private int partId;

    public InHousePart(){
        super();
        machineID = new SimpleIntegerProperty();
    }

    public void setMachineID(int machineID) {
        this.machineID.set(machineID);
    }

    public int getMachineID() {
        return this.machineID.get();
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getPartId() {
        return partId;
    }

    public void setName(String text) {
    }

    public void setInStock(int i) {
    }

    public void setPrice(double v) {
    }

    public void setMin(int i) {
    }

    public void setMax(int i) {
    }
}
