package com.example.lab2bai4; // Thay thế bằng package của bạn

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy tham chiếu đến các nút
        Button btnBai1 = findViewById(R.id.btnBai1);
        Button btnBai2 = findViewById(R.id.btnBai2);

        // Thiết lập OnClickListener cho btnBai1
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo Intent để chuyển đến Bai1Activity
                Intent intent = new Intent(MainActivity.this, Bai1Activity.class);
                // Bắt đầu Bai1Activity
                startActivity(intent);
            }
        });

        // Thiết lập OnClickListener cho btnBai2
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo Intent để chuyển đến Bai2Activity
                Intent intent = new Intent(MainActivity.this, Bai2Activity.class);
                // Bắt đầu Bai2Activity
                startActivity(intent);
            }
        });
    }
}