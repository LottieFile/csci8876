
package com.sajidkhanafridi.coin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] coinSet ={R.drawable.front, R.drawable.back};
        final ImageView tossImage = findViewById(R.id.toss_Image);
        Button tossButton = findViewById(R.id.toss_Button);
        tossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(2);
                tossImage.setImageResource(coinSet[number]);
            }
        });
    }
}