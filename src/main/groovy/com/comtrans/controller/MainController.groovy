package com.comtrans.controller

import com.comtrans.repository.GpsDataRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import java.text.SimpleDateFormat


@Controller
class MainController {

  @Autowired
  GpsDataRepository gpsDataRepository


  @RequestMapping(value = '/', method = RequestMethod.GET)
  def loadMap(){

    return "OpenLayers-2.13.1/marker.html"
  }

}
