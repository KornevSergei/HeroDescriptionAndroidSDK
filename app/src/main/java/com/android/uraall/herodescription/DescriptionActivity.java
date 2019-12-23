package com.android.uraall.herodescription;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        //находим и присваиваем
        TextView title = findViewById(R.id.titleTextView);
        TextView description = findViewById(R.id.descriptionTextView);

        //вставляем информацию по ключу
        Intent intent = getIntent();
        if (intent != null) {
            title.setText(intent.getStringExtra("title"));
            description.setText(intent.getStringExtra("description"));
        }
    }
}
