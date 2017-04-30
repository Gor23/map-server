package com.comtrans.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import java.sql.Timestamp

@Entity
@Table(name = "fuel")
class Fuel {

    @Id
    @GeneratedValue
    Integer id

    @Column(name = "carid")
    Integer carId

    @Column(name = "datastamp")
    Date dataStamp

    String fuel1

    String fuel2

    String engine

    Timestamp updated
}
