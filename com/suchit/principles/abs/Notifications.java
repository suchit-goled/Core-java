package com.suchit.principles.abs;


import com.suchit.principles.abs.inner.Shoe;
import com.suchit.principles.abs.inner.Suitcase;

public interface Notifications {

    void sendNotification();

    String typeOfMessage();

    int numberOfNotification();

    boolean isFraud();

    char categoryOfNotification();

    long notificationId();

    float getDeliveryRate();

    double getSuccessPercentage();

    byte getPriorityLevel();

    short getQueuePosition();

    NotificationType getNotificationType();

    EmailFinder emailFrom();

    Shoe shoe();

    Suitcase suitcase();




}
