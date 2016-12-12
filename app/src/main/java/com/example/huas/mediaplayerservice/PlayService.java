package com.example.huas.mediaplayerservice;

/**
 * Created by HUAS on 2016/12/11.
 */
import android.app.Service;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.IBinder;
        import android.support.annotation.Nullable;

public class PlayService extends Service {
    MediaPlayer mediaPlayer;
    public  PlayService(){

    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet imp;emented");
    }
    public int onStartCommand(Intent intent,int flags,int startId){
        mediaPlayer.start();
        return super.onStartCommand(intent,flags,startId);
    }
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this,R.raw.exodus);
        mediaPlayer.setLooping(true);
    }
    public void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}

