package com.comtrans.domain

import org.omg.PortableInterceptor.INACTIVE

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "cars")
class Cars {

    @Id
    @GeneratedValue
    Integer id

    @Column(name = "userid")
    String userId

    String model

    String driver1

    String plate

    @Column(name = "groupname")
    String groupName

    String koeff

    @Column(columnDefinition = "TINYINT")
    Integer sensors

    String tank1

    String tank2

    String software

    @Column(name = "minfuel")
    Integer minFuel

    @Column(name = "reporttype", columnDefinition = "TINYINT")
    Integer reportType

    @Column(name = "extsensor", columnDefinition = "TINYINT")
    Long extSensor

    @Column(name = "mindistkm", columnDefinition = "TINYINT")
    Integer minDistKm

    @Column(name = "mindistmin", columnDefinition = "TINYINT")
    Integer minDistMin



}
