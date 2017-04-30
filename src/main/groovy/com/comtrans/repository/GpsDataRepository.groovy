package com.comtrans.repository

import com.comtrans.domain.GpsData
import org.springframework.data.jpa.repository.JpaRepository

import java.sql.Timestamp


interface GpsDataRepository extends JpaRepository<GpsData, Long> {

    GpsData findAllByDataStamp (Date dataStamp)

    List<GpsData> findAllByDataStampBetween (Date dataStampStart, Date dataStampEnd)

    List<GpsData> findAllByLat (String lat)
}
