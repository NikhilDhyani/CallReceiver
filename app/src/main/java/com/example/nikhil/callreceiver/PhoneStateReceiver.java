package com.example.nikhil.callreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by NIKHIL on 09-02-2018.
 */

public class PhoneStateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        try {

            System.out.println("Receiver Start");
 /*          String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);

            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                Toast.makeText(context,"Ringing State Number is -",Toast.LENGTH_SHORT).show();
            }
            if ((state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))){
                Toast.makeText(context,"Received State",Toast.LENGTH_SHORT).show();
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
                Toast.makeText(context,"Idle State", Toast.LENGTH_SHORT).show();
            }
            */
                Toast.makeText(context,"Receiver Start",Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


      /*
        String stateStr = intent.getExtras().getString(TelephonyManager.EXTRA_STATE);
        String number = intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
        int state = 0;
        if(stateStr.equals(TelephonyManager.EXTRA_STATE_IDLE)){
            state = TelephonyManager.CALL_STATE_IDLE;

        }
        else if(stateStr.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)){
            state = TelephonyManager.CALL_STATE_OFFHOOK;


        }
        else if(stateStr.equals(TelephonyManager.EXTRA_STATE_RINGING)){
            state = TelephonyManager.CALL_STATE_RINGING;
            Toast.makeText(context, "Incoming Call Ringing" , Toast.LENGTH_SHORT).show();

        }*/

/*
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.d("MY_DEBUG_TAG", state);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String phoneNumber = extras
                        .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.w("MY_DEBUG_TAG", phoneNumber);
                Toast.makeText(context,"Working",Toast.LENGTH_LONG).show();
            }
        }
        */
    }
}
