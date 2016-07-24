package samo92.mx.ambulanteando;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samo92 on 23/07/16.
 */


public class CheckinActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        this.imageView = (ImageView) this.findViewById(R.id.imageView1);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);

            }
        });

        // Spinner element
        Spinner spn_genero = (Spinner) findViewById(R.id.spinner_genero);
        Spinner spn_delegaciones = (Spinner) findViewById(R.id.spinner_delegaciones);

        // Spinner click listener
        spn_genero.setOnItemSelectedListener(this);
        spn_delegaciones.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> genero = new ArrayList<String>();
        genero.add("Hombre");
        genero.add("Mujer");

        List<String> delegaciones = new ArrayList<String>();
        delegaciones.add("Alvaro Obregon");
        delegaciones.add("Azcapotzalco");
        delegaciones.add("Benito Juarez");
        delegaciones.add("Coyoacan");
        delegaciones.add("Cuajimalpa");
        delegaciones.add("Cuauhtemoc");
        delegaciones.add("Gustavo A. Madero");
        delegaciones.add("Iztacalco");
        delegaciones.add("Iztapalapa");
        delegaciones.add("Magdalena Contreras");
        delegaciones.add("Miguel Hidalgo");
        delegaciones.add("Milpa Alta");
        delegaciones.add("Tlahuac");
        delegaciones.add("Tlalpan");
        delegaciones.add("Venuctiano Carranza");
        delegaciones.add("Xochimilco");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genero);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, delegaciones);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spn_genero.setAdapter(dataAdapter);
        spn_delegaciones.setAdapter(dataAdapter2);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}

