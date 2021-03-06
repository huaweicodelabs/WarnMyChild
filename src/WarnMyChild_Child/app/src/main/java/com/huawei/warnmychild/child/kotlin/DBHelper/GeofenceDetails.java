/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.huawei.warnmychild.child.kotlin.DBHelper;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.Text;
import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.annotations.NotNull;
import com.huawei.agconnect.cloud.database.annotations.Indexes;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;

import java.util.Date;

/**
 * Definition of ObjectType GeofenceDetails.
 *
 * @since 2021-05-03
 */
@PrimaryKeys({"ChildID", "Lat", "Lon", "Assignedby"})
public final class GeofenceDetails extends CloudDBZoneObject {
    private String ChildID;

    private String Lat;

    private String Lon;

    private String Radius;

    private String GeofenceName;

    private String Assignedby;

    private Boolean Isvalid;

    public GeofenceDetails() {
        super(GeofenceDetails.class);
    }

    public void setChildID(String ChildID) {
        this.ChildID = ChildID;
    }

    public String getChildID() {
        return ChildID;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public String getLat() {
        return Lat;
    }

    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    public String getLon() {
        return Lon;
    }

    public void setRadius(String Radius) {
        this.Radius = Radius;
    }

    public String getRadius() {
        return Radius;
    }

    public void setGeofenceName(String GeofenceName) {
        this.GeofenceName = GeofenceName;
    }

    public String getGeofenceName() {
        return GeofenceName;
    }

    public void setAssignedby(String Assignedby) {
        this.Assignedby = Assignedby;
    }

    public String getAssignedby() {
        return Assignedby;
    }

    public void setIsvalid(Boolean Isvalid) {
        this.Isvalid = Isvalid;
    }

    public Boolean getIsvalid() {
        return Isvalid;
    }

}
