package com.imobilenetid.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;

public class MainActivity extends AppCompatActivity {


    LottieAnimationView animationView;
    LottieAnimationView animationVieworang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = findViewById(R.id.animation_view);
        animationVieworang = findViewById(R.id.animation_vieworang);


                animationView.setProgress(1);
                animationView.playAnimation();

        animationVieworang.setProgress(1);
        animationVieworang.playAnimation();


    }
}
