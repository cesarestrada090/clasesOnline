package me.soluciona.clasesonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    /** Called when the user clicks the Send button */
    public void irRegistroPersonalizado(View view) {
        Intent intent = new Intent(this, RegistroEmailActivity.class);
        startActivity(intent);
    }
}
