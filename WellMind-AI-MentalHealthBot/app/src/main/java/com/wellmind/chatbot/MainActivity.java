package com.wellmind.chatbot;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView chatView;
    private EditText inputText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatView = findViewById(R.id.chat_view);
        inputText = findViewById(R.id.input_text);
        sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(v -> {
            String input = inputText.getText().toString();
            chatView.append("\nYou: " + input);
            chatView.append("\nBot: I'm here to help you feel better!");
            inputText.setText("");
        });
    }
}