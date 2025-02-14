package whu.edu.cs.transitnet.realtime;

import java.time.LocalDateTime;

/**
 * 标准格式的 gtfs 的实时数据结构
 */
public class Vehicle {
    /*
    车辆 ID
     */
    private String id;
    /*
    服务提供商的 ID
     */
    private String agencyID;

    /*
    预计到达时间
     */
    private LocalDateTime aimedArrivalTime;
    /*
    TODO
     */
    private float bearing;

    /*
    当前车辆行驶路线方向：正向 or 逆向
     */
    private String direction;

    /*
    到达下一站的距离
     */
    private float distanceFromNextStop;

    /*
    距离起点的距离
     */
    private float distanceFromOrigin;

    private double lat;

    private double lon;

    /*
    下一站的名称
     */
    private String nextStop;

    /*
    起点站的名称
     */
    private String originStop;

    /*
    TODO: 意义不明
     */
    private int presentableDistance;

    private LocalDateTime recordedTime;

    /*
    当前轨迹的 ID
     */
    private String routeID;

    /*
    当前行程的 ID
     */
    private String tripID;

    private float speed;
    private long lastUpdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(String agencyID) {
        this.agencyID = agencyID;
    }

    public LocalDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    public void setAimedArrivalTime(LocalDateTime aimedArrivalTime) {
        this.aimedArrivalTime = aimedArrivalTime;
    }

    public float getBearing() {
        return bearing;
    }

    public void setBearing(float bearing) {
        this.bearing = bearing;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public float getDistanceFromNextStop() {
        return distanceFromNextStop;
    }

    public void setDistanceFromNextStop(float distanceFromNextStop) {
        this.distanceFromNextStop = distanceFromNextStop;
    }

    public float getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(float distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    public String getNextStop() {
        return nextStop;
    }

    public void setNextStop(String nextStop) {
        this.nextStop = nextStop;
    }

    public String getOriginStop() {
        return originStop;
    }

    public void setOriginStop(String originStop) {
        this.originStop = originStop;
    }

    public int getPresentableDistance() {
        return presentableDistance;
    }

    public void setPresentableDistance(int presentableDistance) {
        this.presentableDistance = presentableDistance;
    }

    public LocalDateTime getRecordedTime() {
        return recordedTime;
    }

    public void setRecordedTime(LocalDateTime recordedTime) {
        this.recordedTime = recordedTime;
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }


//    public static Vehicle CopyFrom(GtfsRealtime.VehiclePosition point) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setId(point.getVehicle().getId());
////        vehicle.setAgencyID();
////        vehicle.setAimedArrivalTime();
//        
//    }
}
