package com.example.konatsu_p.rotateanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);

        Button buttonFadeOut = findViewById(R.id.button);
        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startRotation();
            }
        });
    }

    private void startRotation() {

        // RotateAnimation(float fromDegrees, float toDegrees, int pivotXType, float pivotXValue, int pivotYType,float pivotYValue)
        RotateAnimation rotate = new RotateAnimation(0.0f, 360.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        // animation時間 msec
        rotate.setDuration(3000);
        // 繰り返し回数
        rotate.setRepeatCount(1);
        // animationが終わったそのまま表示にする
        rotate.setFillAfter(true);

        //アニメーションの開始
        imageView.startAnimation(rotate);

    }
}
