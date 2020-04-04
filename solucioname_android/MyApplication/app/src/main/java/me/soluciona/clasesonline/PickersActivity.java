package me.soluciona.clasesonline;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;
@SuppressLint("Registered")
public class PickersActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String CERO = "0";
    private static final String BARRA = "/";

    public final Calendar c = Calendar.getInstance();

    final int mes = c.get(Calendar.MONTH);
    final int dia = c.get(Calendar.DAY_OF_MONTH);
    final int anio = c.get(Calendar.YEAR);

    EditText etFecha;
    ImageButton ibObtenerFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        etFecha = findViewById(R.id.et_mostrar_fecha_picker);
        ibObtenerFecha = findViewById(R.id.ib_obtener_fecha);
        ibObtenerFecha.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ib_obtener_fecha) {
            obtenerFecha();
        }
    }

    private void obtenerFecha(){
        DatePickerDialog recogerFecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                final int mesActual = month + 1;
                String diaFormateado = (dayOfMonth < 10)? CERO + dayOfMonth :String.valueOf(dayOfMonth);
                String mesFormateado = (mesActual < 10)? CERO + mesActual :String.valueOf(mesActual);
                etFecha.setText(diaFormateado + BARRA + mesFormateado + BARRA + year);


            }

        },anio, mes, dia);
        recogerFecha.show();

    }
}
