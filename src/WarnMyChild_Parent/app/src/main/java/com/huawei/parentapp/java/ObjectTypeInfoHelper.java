/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.huawei.parentapp.java;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.ObjectTypeInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Definition of ObjectType Helper.
 *
 * @since 2021-05-05
 */
public final class ObjectTypeInfoHelper {
    private static final int FORMAT_VERSION = 2;
    private static final int OBJECT_TYPE_VERSION = 6;

    public static ObjectTypeInfo getObjectTypeInfo() {
        ObjectTypeInfo objectTypeInfo = new ObjectTypeInfo();
        objectTypeInfo.setFormatVersion(FORMAT_VERSION);
        objectTypeInfo.setObjectTypeVersion(OBJECT_TYPE_VERSION);
        List<Class<? extends CloudDBZoneObject>> objectTypeList = new ArrayList<>();
        boolean b = Collections.addAll(objectTypeList, com.huawei.parentapp.java.NotificationDetails.class, com.huawei.parentapp.java.testObjectTypeName.class, com.huawei.parentapp.java.GeofenceDetails.class, com.huawei.parentapp.java.ChildInfo.class, com.huawei.parentapp.java.ParentInfo.class);
        objectTypeInfo.setObjectTypes(objectTypeList);
        return objectTypeInfo;
    }
}
