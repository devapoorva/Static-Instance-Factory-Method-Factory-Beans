package com.staticfactory.method.beans;

import java.util.Calendar;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Appointment {
    private int appointmentNo;
    private String name;
    private String location;
    private Calendar appointmentDate;
    private String status;

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAppointmentDate(Calendar appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentNo=" + appointmentNo +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", status='" + status + '\'' +
                '}';
    }
}
