package com.example.admin1.viewpagerapplication.services;

import android.content.Context;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class InstanceIdServiceFCM extends FirebaseInstanceIdService {
    private Context mContext;

    @Override
    public void onTokenRefresh() {
        mContext = this;
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.i("CCCCCCCCCCCC","fcm tokem"+refreshedToken.toString());
        //AppPreferences.getInstance(mContext).putString(AppConstants.FCM_KEY, refreshedToken);
    }
}
