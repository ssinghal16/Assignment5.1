//Show Blinking animation on TextView

package com.acadgild.soniyasinghal.blinkingeffect;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import static android.view.animation.Animation.*;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button blinkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        blinkBtn = (Button) findViewById(R.id.btn);
        blinkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manageBlinkEffect();
            }
        });
    }
    //Method for blink effect
    private void manageBlinkEffect() {
        ObjectAnimator anim = ObjectAnimator.ofInt(txt, "backgroundColor", Color.LTGRAY);

        anim.setDuration(1500);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(REVERSE);
        anim.setRepeatCount(INFINITE);
        anim.start();
    }
}
