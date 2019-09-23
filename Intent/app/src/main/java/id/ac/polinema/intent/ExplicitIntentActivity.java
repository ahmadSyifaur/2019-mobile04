package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExplicitIntentActivity extends AppCompatActivity {

    private TextView outputText;
    private EditText inputText;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        this.outputText= findViewById(R.id.text_output);
        this.inputText= findViewById(R.id.input_name);
        this.submit= findViewById(R.id.submit);
    }

    public void handleSubmit(View view) {
        String input = inputText.getText().toString();

        this.outputText.setText(input);
    }
}
