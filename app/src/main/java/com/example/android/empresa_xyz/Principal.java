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
        double res = 0, unit = 0,cant =0;

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
                                    res = Metodos.total_masculino_zapatillas_nike(0,0,0,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 1:
                                    res = Metodos.total_masculino_zapatillas_adidas(0,0,1,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 2:
                                    res = Metodos.total_masculino_zapatillas_puma(0,0,2,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                            }
                            break;
                        case 1:
                            switch (opmarca) {
                                case 0:
                                    res = Metodos.total_masculino_clasico_nike(0,1,0,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 1:
                                    res = Metodos.total_masculino_clasico_adidas(0,1,1,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 2:
                                    res = Metodos.total_masculino_clasico_puma(0,1,2,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                            }
                    }
                    break;
                case 1:
                    switch (optipo) {
                        case 0:
                            switch (opmarca) {
                                case 0:
                                    res = Metodos.total_femenino_zapatillas_nike(1,0,0,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 1:
                                    res = Metodos.total_femenino_zapatillas_adidas(1,0,1,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 2:
                                    res = Metodos.total_femenino_zapatillas_puma(1,0,2,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                            }
                            break;
                        case 1:
                            switch (opmarca) {
                                case 0:
                                    res = Metodos.total_femenino_clasico_nike(1,1,0,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 1:
                                    res = Metodos.total_femenino_clasico_adidas(1,1,1,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                                case 2:
                                    res = Metodos.total_femenino_clasico_puma(1,1,2,Integer.parseInt(cantidad.getText().toString()));
                                    break;
                            }
                    }
                    break;
            }
            //cajasubtotal.setText("TOTAL UNIT = $" + unit);
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
