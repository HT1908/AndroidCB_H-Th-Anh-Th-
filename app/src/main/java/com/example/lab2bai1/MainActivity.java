package com.example.lab2bai1;
import android.os.Bundle;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_slash);
        int[] icon = {
                R.drawable.penguin,
                R.drawable.hedgehog,
                R.drawable.panda,
                R.drawable.dog
        };
        int[] colors = {
                R.color.teal_200,
                R.color.yellow,
                R.color.purple_500,
                R.color.pink,
                R.color.purple_200,
        };

        Random random = new Random();
        int randomColorIndex = random.nextInt(colors.length);
        int randomIconIndex = random.nextInt(icon.length);

        FrameLayout FrameLayout = findViewById(R.id.id);
        FrameLayout.setBackgroundColor(colors[randomColorIndex]);
        LinearLayout LinearLayout = findViewById(R.id.li);
        LinearLayout.setBackgroundColor(colors[randomColorIndex]);

        ImageView imageView = findViewById(R.id.icon);
        imageView.setImageResource(icon[randomIconIndex]);

    }
}