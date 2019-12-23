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

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);

        Intent intent = getIntent();
        if (intent != null) {
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
        }
    }
}
