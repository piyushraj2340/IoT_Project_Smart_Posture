package com.example.smartposture;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import static com.example.smartposture.Global.x;
import static com.example.smartposture.Global.z;

public class AndroidService extends Service {
    MediaPlayer mp;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        mp = MediaPlayer.create(this, R.raw.soundbeep);

        mp.setLooping(true);

        mp.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
