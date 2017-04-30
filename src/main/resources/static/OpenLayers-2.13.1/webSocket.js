function connect(destination) {
    var socket = new SockJS(destination);
    var stompClient = Stomp.over(socket);

    stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/receiv', function (message) {
            var result  = JSON.parse(message.body);
            setDot(result.lat, result.lon);
        });
    });
}


function setDot (lat, lon){

    //var zoom=12;
    var lonLat = new OpenLayers.LonLat(lon, lat)
        .transform(
            new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
            map.getProjectionObject() // to Spherical Mercator Projection
        );
    var size = new OpenLayers.Size(10,10);
    var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
    var icon = new OpenLayers.Icon("/SNP_2752068_en_v0.png", size, offset);

    markers.addMarker(new OpenLayers.Marker(lonLat, icon));
    map.setCenter (lonLat);
}



