package com.victorchoi.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;

public class CalcService extends Service {
    private final String TAG = "Server-Service";

    public CalcService() {
        Log.d(TAG, "CalcService is initialized!");
    }

    private final ICalc.Stub binder = new ICalc.Stub() {
        @Override
        public int sum(int a, int b) throws RemoteException {
            return 100;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
//        intent.setPackage("com.victorchoi.client");
        Log.d(TAG, "onBind" + intent.toString());
        return binder;
    }

}