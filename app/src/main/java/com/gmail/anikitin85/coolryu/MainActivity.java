package com.gmail.anikitin85.coolryu;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable imageAnimation;
    ImageView image;
    TextView text;
    int i = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        image = (ImageView) findViewById(R.id.image);
        image.setBackgroundResource(R.drawable.ani1);
        imageAnimation = (AnimationDrawable) image.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        imageAnimation.start();
    }

    public void switchAni(View view) {
        switch (i++) {
            case 1:
                image.setBackgroundResource(R.drawable.ani1);
                text.setText("Animation 1");
                break;
            case 2:
                image.setBackgroundResource(R.drawable.ani2);
                text.setText("Animation 2");
                break;
            case 3:
                image.setBackgroundResource(R.drawable.ani3);
                text.setText("Animation 3");
                break;
            case 4:
                image.setBackgroundResource(R.drawable.ani4);
                text.setText("Animation 4");
        }
        imageAnimation = (AnimationDrawable) image.getBackground();
        imageAnimation.start();
        if (i == 5) i = 1;
    }
}
