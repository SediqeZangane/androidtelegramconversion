package com.example.androidtelgramconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        img1 = findViewById(R.id.img_profile1);
        img2 = findViewById(R.id.img_profile2);
        img3 = findViewById(R.id.img_profile3);
        img4 = findViewById(R.id.img_Profile4);
        img5 = findViewById(R.id.img_Profile5);
        img6 = findViewById(R.id.img_Profile6);
        img7 = findViewById(R.id.img_Profile7);
        img8 = findViewById(R.id.img_Profile8);
        img9 = findViewById(R.id.img_Profile9);


        String imgUrl = "https://media.istockphoto.com/photos/neon-heart-on-brick-wall-picture-id848235926?k=6&m=848235926&s=612x612&w=0&h=resOh2Qt0_wYIOoLGcbnGtu_rXw5Dkp_IsqrerWzWCQ=";


        Glide.with(MainActivity.this).load(imgUrl).into(img1);
        Glide.with(MainActivity.this).load(imgUrl).into(img2);
        Glide.with(MainActivity.this).load(imgUrl).into(img3);
        Glide.with(MainActivity.this).load(imgUrl).into(img4);

    }
}