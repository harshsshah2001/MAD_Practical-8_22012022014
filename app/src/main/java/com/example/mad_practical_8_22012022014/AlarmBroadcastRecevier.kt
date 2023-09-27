package com.example.mad_practical_8_22012022014

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastRecevier : BroadcastReceiver() {
companion object{
    val ALARMKEY="KEY"
    val ALARMSTART="START"
    val ALARMSTOP="STOP"
}
    override fun onReceive(context: Context, intent: Intent) {
        val data=intent.getStringExtra(ALARMKEY)
        val intentService=Intent(context,AlramService::class.java)
        if (data == ALARMSTART){
            context.startService(intentService)
        }
        else {
           context.stopService(intentService)
         }
        }
    }
