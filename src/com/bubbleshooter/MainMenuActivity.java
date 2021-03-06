package com.bubbleshooter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainMenuActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// to make it Fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		DisplayMetrics metrics = this.getResources().getDisplayMetrics();
		Point dims = new Point(metrics.widthPixels, metrics.heightPixels);
		
		setContentView(R.layout.activity_main_menu);

		
		((LinearLayout) findViewById(R.id.main_men_LLayout)).setPadding(0, 0, 0, dims.y/10);
		
		
		ImageView play = (ImageView) findViewById(R.id.play);
		final Intent levelChooser = new Intent(MainMenuActivity.this, LevelChooserActivity.class);
		play.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	startActivity(levelChooser);
		    }
		});
		
		final ImageView sound = (ImageView) findViewById(R.id.sound);
		sound.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	//TODO switch sound 
		    	sound.setBackgroundResource(R.drawable.sound_off);
		    }
		});
		
		
		
	}

}