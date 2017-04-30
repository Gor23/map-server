package com.comtrans.service

import com.comtrans.domain.GpsData
import com.comtrans.model.DotViewModel
import com.comtrans.repository.GpsDataRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.core.MessageSendingOperations
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct
import java.text.SimpleDateFormat

@Service
class MapService {

    @Autowired
    GpsDataRepository gpsDataRepository

    @Autowired
    ObjectMapper objectMapper

    @Autowired
    MessageSendingOperations<String> messagingTemplate;

    List<GpsData> dots = []

    Integer dotCounter = 0

    @PostConstruct
    void readDataFromDB(){

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date startDate = formatter.parse("01-03-2017")
        Date endDate = formatter.parse("02-03-2017")
        dots = gpsDataRepository.findAllByDataStampBetween(startDate, endDate)
    }

    @Scheduled(fixedDelay = 500L)
    def defsendPointToFront(){


        DotViewModel model = []

        if (dotCounter<dots.size()){
            model = new DotViewModel(lat: dots[dotCounter].lat,
                    lon: dots[dotCounter].lon)
            dotCounter++
        }
        else{
            dotCounter = 0
        }

        //def json = objectMapper.writeValueAsString(model)

        messagingTemplate.convertAndSend("/topic/receiv", model)
    }

}
