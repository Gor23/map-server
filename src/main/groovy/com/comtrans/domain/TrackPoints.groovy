package com.comtrans.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import java.sql.Timestamp

@Entity
@Table(name = "TrackPoints")
class TrackPoints {

    @Id
    @GeneratedValue
    Long rec_Id;

    Integer car_Id;

    @Column(name = "create_datetime")
    Timestamp createDateTime;

    Timestamp add_datetime;

    @Column(columnDefinition = "DECIMAL")
    double latitude;

    @Column(columnDefinition = "DECIMAL")
    double longitude;
    Integer altitude;

    @Column(columnDefinition = "DECIMAL")
    double accur;

    @Column(columnDefinition = "CHAR")
    String validation;
    Integer nsat;

    @Column(columnDefinition = "CHAR")
    String motion;
    Integer speed;
    Integer course;
    Integer distance;

    @Column(columnDefinition = "DECIMAL")
    double onboard_Voltage;

    @Column(columnDefinition = "DECIMAL")
    double battrey_Voltage;

    @Column(columnDefinition = "DECIMAL")
    double device_Temp;

    @Column(columnDefinition = "CHAR")
    String engine;

    @Column(columnDefinition = "CHAR")
    String fuel_Sensor_1_State;
    Integer fuel_Sensor_1_Value;
    Integer fuel_Sensor_1_Liters;
    Integer fuel_Sensor_1_Temp;

    @Column(columnDefinition = "CHAR")
    String fuel_Sensor_2_State;
    Integer fuel_Sensor_2_Value;
    Integer fuel_Sensor_2_Liters;
    Integer fuel_Sensor_2_Temp;

    @Column(columnDefinition = "CHAR")
    String fuel_Sensor_3_State;
    Integer fuel_Sensor_3_Value;
    Integer fuel_Sensor_3_Liters;
    Integer fuel_Sensor_3_Temp;
    Integer total_Fuel_Value;
    Integer total_Fuel_Liters;
    Integer event;
    Integer point_Level;
    Integer kind;
    Integer v_Port;
    Integer adc0;
    Integer adc1;
    Integer adc2;
    Integer adc3;
    Integer adc4;
    Integer adc5;
    Integer adc6;

    @Column(columnDefinition = "DECIMAL")
    double accel_X;

    @Column(columnDefinition = "DECIMAL")
    double accel_Y;

    @Column(columnDefinition = "DECIMAL")
    double accel_Z;

    @Column(columnDefinition = "CHAR")
    String add_Source;

    @Column(columnDefinition = "CHAR")
    String process;

    @Column(columnDefinition = "CHAR")
    String status;

    @Column(columnDefinition = "CHAR")
    String reliability;
}
