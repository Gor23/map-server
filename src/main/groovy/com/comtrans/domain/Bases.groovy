package com.comtrans.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import java.sql.Timestamp

@Entity
@Table(name = "bases")
class Bases {

    @Id
    @GeneratedValue
    Integer id;
    Timestamp datastamp;
    String lat;
    String lon;
    String radius;
    String comment;
}
