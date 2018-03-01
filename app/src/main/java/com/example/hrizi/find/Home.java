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

public class Home extends AppCompatActivity {
    TextView t;
    ImageButton playbtn,likebtn,lovebtn,ratebtn,fbbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t = (TextView) findViewById(R.id.find);
        Typeface textfindfont= Typeface.createFromAsset(getAssets(),"fonts/Canterbury.ttf");
        t.setTypeface(textfindfont);


        playbtn = (ImageButton) findViewById(R.id.playbtn);
        likebtn = (ImageButton) findViewById(R.id.likebtn);
        lovebtn = (ImageButton) findViewById(R.id.lovebtn);
        ratebtn = (ImageButton) findViewById(R.id.ratebtn);
        fbbtn = (ImageButton) findViewById(R.id.fbbtn);



        playbtn.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                MediaPlayer soundclick=MediaPlayer.create(Home.this,R.raw.click);
                soundclick.start();
                Intent i= new Intent(Home.this,stages.class);
                startActivity(i);
            }
        });




    }

    public  void  likebtnClick(View v){
        MediaPlayer soundclick=MediaPlayer.create(Home.this,R.raw.click);
        soundclick.start();
        Toast.makeText(this,"url like button",Toast.LENGTH_SHORT).show();
    }
    public  void  lovebtnClick(View v){
        MediaPlayer soundclick=MediaPlayer.create(Home.this,R.raw.click);
        soundclick.start();
        Toast.makeText(this,"url love button",Toast.LENGTH_SHORT).show();
    }
    public  void  ratebtnClick(View v){
        MediaPlayer soundclick=MediaPlayer.create(Home.this,R.raw.click);
        soundclick.start();
        Toast.makeText(this,"url rate button",Toast.LENGTH_SHORT).show();
    }







}
