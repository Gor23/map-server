package com.comtrans.domain


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType
import java.sql.Timestamp

@Entity
@Table(name = "gpsdata")
class GpsData {

    @Id
    @GeneratedValue
    Integer id

    @Column(name = "carid", unique = true)
    Integer carId

//    @Column(name = "datastamp", unique = true)
//    Timestamp dataStamp;

    @Column(name = "datastamp", nullable = false, unique = true)
    @Temporal(TemporalType.TIMESTAMP)
    Date dataStamp

    @Column(columnDefinition = "CHAR")
    String started

    @Column(columnDefinition = "CHAR")
    String parking

    String battery
    String charge
    String lat
    String lon

    @Column(columnDefinition = "CHAR")
    String speed

    @Column(columnDefinition = "CHAR")
    String course
    Integer sattelites
    Integer systemcounter
    String distance
    String lastpark
    @Column(columnDefinition = "TINYINT")
    Integer engine

    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    Date updated

    @Column(columnDefinition = "CHAR")
    String routed

    Integer route_Id
    String temp1
    String fuel1

    @Column(columnDefinition = "TINYINT")
    Integer fueldown1

    @Column(columnDefinition = "TINYINT")
    Integer fuelfail1
    String temp2
    String fuel2

    @Column(columnDefinition = "TINYINT")
    Integer fueldown2

    @Column(columnDefinition = "TINYINT")
    Integer fuelfail2

    Integer temp3
    Integer fuel3

    @Column(columnDefinition = "TINYINT")
    Integer fueldown3

    @Column(columnDefinition = "TINYINT")
    Integer fuelfail3

    @Column(name = "routestart")
    @Temporal(TemporalType.TIMESTAMP)
    Date routestart

    String routepark

    String routenumpark

    String routedist

    @Column(columnDefinition = "TINYINT")
    Integer badgps
    Integer gpshdop

    @Column(columnDefinition = "SMALLINT")
    Integer mode
}
