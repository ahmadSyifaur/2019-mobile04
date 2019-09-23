package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        this.usernameText= findViewById(R.id.text_username);
        this.nameText= findViewById(R.id.text_name);
        this.ageText= findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // TODO: display value here
            this.usernameText.setText(extras.getString(BundleActivity.USERNAME_KEY));
            this.nameText.setText(extras.getString(BundleActivity.NAME_KEY));
            this.ageText.setText(extras.getInt(BundleActivity.AGE_KEY)+"");
        }
    }
}
