package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent intent = new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent intent = new Intent (this, ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleBundle(View view) {
        Intent intent = new Intent(this, BundleActivity.class);
        startActivity(intent);
    }

    public void handleParceable(View view) {
        Intent intent = new Intent(this, ParcelableActivity.class);
        startActivity(intent);
    }
}
