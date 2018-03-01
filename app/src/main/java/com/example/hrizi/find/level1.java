package com.example.hrizi.find;

import android.content.ClipData;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Level;

import static android.graphics.Color.*;

public class level1 extends AppCompatActivity {
TextView t,score;
ImageView img,trounoir,target,newimageview;
Random random;
ConstraintLayout game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        t = (TextView) findViewById(R.id.find);
        Typeface textfindfont= Typeface.createFromAsset(getAssets(),"fonts/Canterbury.ttf");
        t.setTypeface(textfindfont);


        score = (TextView) findViewById(R.id.score);

        img=(ImageView) findViewById(R.id.android);
        target=(ImageView) findViewById(R.id.target);



        img.setOnLongClickListener(longClickListener);


        target.setOnDragListener(DragListener);







    }



    View.OnLongClickListener longClickListener= new View.OnLongClickListener(){

        @Override
        public boolean onLongClick(View view) {

            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myshadowbuilder= new View.DragShadowBuilder(view);
            view.startDrag(data,myshadowbuilder,view,0);
            return true;
        }
    };


    View.OnDragListener DragListener= new View.OnDragListener(){

        @Override
        public boolean onDrag(View view, DragEvent dragEvent) {
            int scorenumber =0;
            int drgevent= dragEvent.getAction();


            //ysagel chkoun 3malnelou edrag
            final  View v =(View) dragEvent.getLocalState();
            switch (drgevent){

                case DragEvent.ACTION_DRAG_ENTERED:



                  if(v.getId()==R.id.android){
                      //ken e text yod5el liltarget

                      target.setImageResource(R.drawable.trounoir);

                  }

                break;
                case DragEvent.ACTION_DRAG_EXITED:
                   if(v.getId()==R.id.android){
                        //ken e text yo5rej m target

                       target.setImageResource(R.drawable.trourouge);
                    }
                    break;

                case DragEvent.ACTION_DROP:
                    if(v.getId()==R.id.android){
                        //ken e text yod5el liltarget w t5alih f target
                        //target.setText("txt1 droped");

                        v.animate()
                                .x(target.getX())
                                .y(target.getY())
                                .start();
                        MediaPlayer mymedia= MediaPlayer.create(level1.this,R.raw.target);
                        mymedia.start();

                        img.setVisibility(View.GONE);
                        scorenumber +=2;
                        score.setText(String.valueOf(scorenumber));





                        newimageview = (ImageView) findViewById(R.id.android);
                        ConstraintLayout game = (ConstraintLayout)findViewById(R.id.game);

                        int width = game.getWidth();
                        int height = game.getHeight();

                        random = new Random();

                        int x = width;
                        int y = height;

                        int imageX = random.nextInt(x-50)+50;
                        int imageY = random.nextInt(y-100)+100;

                        newimageview.setX(imageX);
                        newimageview.setY(imageY);





                    }




                    break;
            }



            return true;
        }
    };




}
