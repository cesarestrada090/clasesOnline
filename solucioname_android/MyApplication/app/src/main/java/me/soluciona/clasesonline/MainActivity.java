package me.soluciona.clasesonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }
    public void irPantallaInicio(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}


