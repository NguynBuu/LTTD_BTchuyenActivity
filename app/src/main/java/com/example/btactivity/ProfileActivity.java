package com.example.btactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton settingsButton = findViewById(R.id.buttonSettings);
        TextView displayNameTextView = findViewById(R.id.textViewDisplayName);

        String username = getIntent().getStringExtra("EXTRA_USERNAME");

        if (username != null && username.equals("Nguyen Buu")) {

            displayNameTextView.setText("❤ " + username + " ❤");

        } else {
            displayNameTextView.setText("@Khách_Thân_Thiết");
        }

        settingsButton.setOnClickListener(v -> {
            finish();
        });
    }
}