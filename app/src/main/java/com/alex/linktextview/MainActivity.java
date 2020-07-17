package com.alex.linktextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.alex.textview.view.LinkTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkTextView textView = findViewById(R.id.text);
        textView.setOnLinkClickListener(new LinkTextView.OnLinkClickListener() {
            @Override
            public void onTelLinkClick(String phoneNumber) {
                Toast.makeText(MainActivity.this, "识别到电话号码是：" + phoneNumber, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMailLinkClick(String mailAddress) {
                Toast.makeText(MainActivity.this, "识别到邮件地址是：" + mailAddress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onWebUrlLinkClick(String url) {
                Toast.makeText(MainActivity.this, "识别到网页链接是：" + url, Toast.LENGTH_SHORT).show();
            }
        });
    }
}