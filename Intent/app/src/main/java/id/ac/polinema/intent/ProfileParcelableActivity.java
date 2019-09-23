package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;
import id.ac.polinema.intent.model.User;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);


        // TODO: bind here
        this.usernameText= findViewById(R.id.text_username);
        this.nameText= findViewById(R.id.text_name);
        this.ageText= findViewById(R.id.text_age);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            User u = extras.getParcelable(ParcelableActivity.USER_KEY);

            this.usernameText.setText(u.getUsername());
            this.nameText.setText(u.getName());
            this.ageText.setText(""+u.getAge());
        }
    }
}
