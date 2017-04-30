package com.comtrans.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "coeffs")
class Coeffs {

    @Id
    @GeneratedValue
    @Column(name = "rec_id")
    Integer recId

    @Column(name = "car_id")
    Integer carId

    @Column(name = "dist_correction")
    Float distCorrection

    Float Vth

    Float Vtl

}
