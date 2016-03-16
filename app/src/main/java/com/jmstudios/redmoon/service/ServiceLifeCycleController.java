package com.jmstudios.redmoon.service;

import android.app.Notification;

public interface ServiceLifeCycleController {
    void startForeground(int id, Notification notification);
    void stopForeground(boolean removeNotification);
    void stop();
}