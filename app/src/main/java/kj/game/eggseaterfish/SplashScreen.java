package kj.game.eggseaterfish;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
		new Thread(){
            @Override public void run() {
                try{
                    sleep(5000);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                }
            }
        }.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
