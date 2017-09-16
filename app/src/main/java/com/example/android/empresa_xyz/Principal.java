package com.example.android.empresa_xyz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private EditText cantidad;
    private TextView cajatotal, cajasubtotal;
    private Spinner combosexo, combotipo, combozapato;
    private String[] sexo;
    private String[] tipo;
    private String[] zapato;
    private ArrayAdapter adaptersexo;
    private ArrayAdapter adaptertipo;
    private ArrayAdapter adapterzapato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantidad = (EditText)findViewById(R.id.txtcantidad);
        cajatotal = (TextView)findViewById(R.id.txtotal);
        cajasubtotal = (TextView)findViewById(R.id.txsubtotal);
        combosexo = (Spinner) findViewById(R.id.cmbsexo);
        combotipo = (Spinner)findViewById(R.id.cmbtipo);
        combozapato = (Spinner)findViewById(R.id.cmbmarca);

        sexo = this.getResources().getStringArray(R.array.sexo);
        adaptersexo = new ArrayAdapter(this,android.R.layout.simple_list_item_1,sexo);
        combosexo.setAdapter(adaptersexo);

        tipo = this.getResources().getStringArray(R.array.tipo);
        adaptertipo = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tipo);
        combotipo.setAdapter(adaptertipo);

        zapato = this.getResources().getStringArray(R.array.zapato);
        adapterzapato = new ArrayAdapter(this,android.R.layout.simple_list_item_1,zapato);
        combozapato.setAdapter(adapterzapato);

    }

    public void total(View v) {

        int opsexo, optipo, opmarca;
        double res = 0, uni = 0,cant =0;

        if (validar()) {

            opsexo = combosexo.getSelectedItemPosition();
            optipo = combotipo.getSelectedItemPosition();
            opmarca = combozapato.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());

            switch (opsexo) {
                case 0:
                    switch (optipo) {
                        case 0:
                            switch (opmarca) {
                                case 0:
                                    uni = 120000;
                                    res = cant * 120000;
                                    break;
                                case 1:
                                    uni = 140000;
                                    res = cant * 140000;
                                    break;
                                case 2:
                                    uni = 130000;
                                    res = cant * 130000;
                                    break;
                            }
                            break;
                        case 1:
                            switch (opmarca) {
                                case 0:
                                    uni = 50000;
                                    res = cant * 50000;
                                    break;
                                case 1:
                                    uni = 80000;
                                    res = cant * 80000;
                                    break;
                                case 2:
                                    uni = 100000;
                                    res = cant * 100000;
                                    break;
                            }
                    }
                    break;
                case 1:
                    switch (optipo) {
                        case 0:
                            switch (opmarca) {
                                case 0:
                                    uni = 100000;
                                    res = cant * 100000;
                                    break;
                                case 1:
                                    uni = 130000;
                                    res = cant * 130000;
                                    break;
                                case 2:
                                    uni = 110000;
                                    res = cant * 110000;
                                    break;
                            }
                            break;
                        case 1:
                            switch (opmarca) {
                                case 0:
                                    uni = 60000;
                                    res = cant * 60000;
                                    break;
                                case 1:
                                    uni = 70000;
                                    res = cant * 70000;
                                    break;
                                case 2:
                                    uni = 120000;
                                    res = cant * 120000;
                                    break;
                            }
                    }
                    break;
            }
            cajasubtotal.setText("TOTAL UNIT = $" + uni);
            cajatotal.setText("TOTAL = $"  + res);
        }
    }


    public boolean validar(){
        if(cantidad.getText().toString().isEmpty()){
            cantidad.setError(this.getResources().getString(R.string.error_vacio));
            cantidad.requestFocus();
            return false;
        }
        if(Double.parseDouble( cantidad.getText().toString())==0){
            cantidad.requestFocus();
            cantidad.setError(this.getResources().getString(R.string.error_cero));
            return false;
        }
        return true;
    }

    public void borrar(View v){
        cajasubtotal.setText("");
        cajatotal.setText("");
        cantidad.setText("");
        cantidad.requestFocus();
    }
}
