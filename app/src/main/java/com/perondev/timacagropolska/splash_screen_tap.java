package com.perondev.timacagropolska;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splash_screen_tap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        ZmianaCzcionkiAll.zmienStandardowaCzcionke(this, "DEFAULT", "fonts/WorkSans-Thin.otf");
        setContentView(R.layout.activity_splash_screen);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(splash_screen_tap.this,glowna.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
