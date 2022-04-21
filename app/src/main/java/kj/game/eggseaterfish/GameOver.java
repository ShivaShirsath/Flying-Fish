package kj.game.eggseaterfish;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class GameOver extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over);
		try{
			Intent intent = getIntent();
		((TextView)findViewById(R.id.score)).setText("Score is "+intent.getStringExtra("s").toString());
		}catch(Exception e){
			Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
		}
	}
}
