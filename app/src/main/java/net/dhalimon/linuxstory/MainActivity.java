package net.dhalimon.linuxstory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText;
    private Button starButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.nameEditText);
        starButton = findViewById(R.id.startButton);

        starButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();

                Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
                startStory(name);


            }
        });
    }


    private void startStory(String name) {
    }

}