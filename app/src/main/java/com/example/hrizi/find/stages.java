package com.example.hrizi.find;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class stages extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);

        t = (TextView) findViewById(R.id.find);
        Typeface textfindfont= Typeface.createFromAsset(getAssets(),"fonts/Canterbury.ttf");
        t.setTypeface(textfindfont);

        //Create your buttons and set their onClickListener to "this"
        ImageButton L1 = (ImageButton) findViewById(R.id.l1);
        ImageButton L2 = (ImageButton) findViewById(R.id.l2);
        ImageButton L3 = (ImageButton) findViewById(R.id.l3);









    }


    public  void  l1btnClick(View v){
        //Toast.makeText(this,"vers l1",Toast.LENGTH_SHORT).show();
        MediaPlayer soundclick=MediaPlayer.create(stages.this,R.raw.click);
        soundclick.start();
        Intent IL1= new Intent(stages.this,level1.class);
        startActivity(IL1);
    }
    public  void  l2btnClick(View v){
        MediaPlayer soundclick=MediaPlayer.create(stages.this,R.raw.click);
        soundclick.start();
        Toast.makeText(this,"vers l2",Toast.LENGTH_SHORT).show();
    }
    public  void  l3btnClick(View v){
        Toast.makeText(this,"vers l3",Toast.LENGTH_SHORT).show();
    }





}
