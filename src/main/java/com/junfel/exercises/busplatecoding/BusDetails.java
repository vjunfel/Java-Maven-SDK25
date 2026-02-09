package com.junfel.exercises.busplatecoding;

public class BusDetails {
    private String busName;
    private String plateNo;
    private String driver;
    private String codingDay;

    BusDetails(String busName, String plateNo, String driver, String codingDay) {
        this.busName = busName;
        this.plateNo = plateNo;
        this.driver = driver;
        this.codingDay = codingDay;
    }

    public String getName() {
        return busName;
    }

    public void setName(String busName) {
        this.busName = busName;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCodingDay() {
        return codingDay;
    }

    @Override
    public String toString() {
        return busName + " " + plateNo + " " + driver;
    }
}
