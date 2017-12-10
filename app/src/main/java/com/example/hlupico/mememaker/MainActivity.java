package com.example.hlupico.mememaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0f);  /** Step 1 - remove automatic action bar shadow */
        TextView getStartedText = (TextView) findViewById(R.id.get_started_text);
    getStartedText.setText("ChickTech");
    getStartedText.setTextColor(getResources().getColor(android.R.color.holo_blue_bright));
        ImageButton imageButton = (ImageButton) findViewById(R.id.new_meme_button);
        TextView.OnClickListener imageClickListener = getImageButtonClick();
        imageButton.setOnClickListener(imageClickListener);
    }
private View.OnClickListener getImageButtonClick() {
    View.OnClickListener ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "You clicked the button!", Toast.LENGTH_SHORT).show();

            //Go to NewMemeActivity
            Intent intent = new Intent(MainActivity.this, NewMemeActivity.class);
            startActivity(intent);
        }
    };
    return ClickListener;
  }
}