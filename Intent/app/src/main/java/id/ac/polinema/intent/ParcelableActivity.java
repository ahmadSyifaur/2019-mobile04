package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;
import id.ac.polinema.intent.model.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user" ;

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        this.usernameInput=findViewById(R.id.input_username);
        this.nameInput=findViewById(R.id.input_name);
        this.ageInput=findViewById(R.id.input_age);


    }

    public void handleSubmit(View view) {
        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());

        user = new User(username,name,age);

        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        intent.putExtra(USER_KEY, user);
        startActivity(intent);
    }
}
