package com.example.myprject2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNoteActivity extends AppCompatActivity {

    Button addNote;
    EditText title, content;
    TextView showNote;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addNote = findViewById(R.id.button3);
        title = findViewById(R.id.editTextText2);
        content = findViewById(R.id.editTextText3);
        showNote = findViewById(R.id.textView3);

        addNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mtitle = title.getText().toString();
                String mContent = content.getText().toString();

                TextNote note1 = new TextNote(mtitle,"29-074-2026",mContent);

                String displayText = note1.display();
                showNote.setText(displayText);

                Intent contactus = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(contactus);

            }
        });
    }
}


