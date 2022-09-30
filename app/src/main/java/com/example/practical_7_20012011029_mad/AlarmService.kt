package com.example.practical_7_20012011029_mad

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.example.practical_7_20012011029_mad.R.raw.alarm

class AlarmService : Service() {
    var mp: MediaPlayer? = null
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent != null) {
            mp = MediaPlayer.create(this,R.raw.alarm)
            mp?.start()
        }
        return START_STICKY
    }
    override fun onDestroy() {
        mp?.stop()
        super.onDestroy()
    }
}