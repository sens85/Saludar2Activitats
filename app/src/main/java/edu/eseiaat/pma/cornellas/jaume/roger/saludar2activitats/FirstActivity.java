package edu.eseiaat.pma.cornellas.jaume.roger.saludar2activitats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private EditText editTextnom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editTextnom = (EditText)findViewById(R.id.editTextnom);
    }

    public void Saludar(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        String nom = editTextnom.getText().toString();
        intent.putExtra(SecondActivity.KEY_NOM,nom);
        startActivity(intent);
    }
}
