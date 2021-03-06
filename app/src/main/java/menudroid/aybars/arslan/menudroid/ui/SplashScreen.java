package menudroid.aybars.arslan.menudroid.ui;

/**
 * Created by Aybars on 08.03.2015.
 */
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import menudroid.aybars.arslan.menudroid.MainActivity;
import menudroid.aybars.arslan.menudroid.R;

public class SplashScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /*
         * When we get the menu from json
         * use splash
         */

        Thread timer = new Thread() {

            public void run() {
                try {
                    sleep(1000);// 4 second wait
                } catch (InterruptedException e) {
                    Log.d("ERROR",e.toString());
                    Thread.currentThread().interrupt();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}