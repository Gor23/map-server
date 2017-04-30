package com.comtrans.repository

import com.comtrans.domain.TrackPoints
import org.springframework.data.jpa.repository.JpaRepository

import java.sql.Timestamp


interface TrackPointsRepository extends JpaRepository<TrackPoints, Long> {

    List<TrackPoints> findAllByCreateDateTime (Timestamp createDateTime)
}
