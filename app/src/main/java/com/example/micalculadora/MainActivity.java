package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    public double operan1,operan2,res;
    int ope;
    String unidad_angular="DEG";
    DecimalFormat decimales = new DecimalFormat("#.###");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant = (EditText)findViewById(R.id.pantalla);
        final Button btn_grados = findViewById(R.id.button_radgrad);

        btn_grados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_grados.getText().toString() == "RAD") {
                    btn_grados.setText("DEG");
                    unidad_angular = "DEG";
                    double num = Double.parseDouble(pant.getText().toString());
                    pant.setText(decimales.format(Math.toDegrees(num)));
                } else {
                    btn_grados.setText("RAD");
                    unidad_angular = "RAD";
                    double num = Double.parseDouble(pant.getText().toString());
                    pant.setText(decimales.format(Math.toRadians(num)));
                }
            }
        });
    }

    public void bt1 (View v){
        String cap = pant.getText().toString();
        cap = cap + "1";
        pant.setText(cap);
    }
    public void bt2 (View v){
        String cap = pant.getText().toString();
        cap = cap + "2";
        pant.setText(cap);
    }
    public void bt3 (View v){
        String cap = pant.getText().toString();
        cap = cap + "3";
        pant.setText(cap);
    }
    public void bt4 (View v){
        String cap = pant.getText().toString();
        cap = cap + "4";
        pant.setText(cap);
    }
    public void bt5 (View v){
        String cap = pant.getText().toString();
        cap = cap + "5";
        pant.setText(cap);
    }
    public void bt6 (View v){
        String cap = pant.getText().toString();
        cap = cap + "6";
        pant.setText(cap);
    }
    public void bt7 (View v){
        String cap = pant.getText().toString();
        cap = cap + "7";
        pant.setText(cap);
    }
    public void bt8 (View v){
        String cap = pant.getText().toString();
        cap = cap + "8";
        pant.setText(cap);
    }
    public void bt9 (View v){
        String cap = pant.getText().toString();
        cap = cap + "9";
        pant.setText(cap);
    }
    public void bt0 (View v){
        String cap = pant.getText().toString();
        cap = cap + "0";
        pant.setText(cap);
    }
    public void btcoma (View v){
        String cap = pant.getText().toString();
        cap = cap + ".";
        pant.setText(cap);
    }
    public void suma (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("");
        ope=1;
    }
    public void resta (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("");
        ope=3;
    }
    public void division (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("");
        ope=4;
    }
    public void sin (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("sin("+operan1+")");
        ope=5;
    }
    public void cos (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("cos("+operan1+")");
        ope=6;
    }
    public void tan (View v){
        try{
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch(NumberFormatException nfe){}
        pant.setText("tan("+operan1+")");
        ope=7;
    }

    public void igual (View v){
        try{
            String aux2 = pant.getText().toString();
            operan2 = Double.parseDouble(aux2);
        } catch(NumberFormatException nfe){}
        pant.setText("");
        if(ope==1){
            res = operan1+operan2;
        }
        else if (ope==2){
            res = operan1-operan2;
        }
        else if(ope==3){
            res = operan1*operan2;
        }
        else if (ope==4){
            if(operan2==0) {
                pant.setText("Error");
            }
            else {
                res = operan1 / operan2;
            }
        }
        else if (ope==5){
            double rad=Math.toRadians(operan1);
            res = (Math.sin(rad));
        }
        else if (ope==6){
            double rad=Math.toRadians(operan1);
            res = (Math.cos(rad));
        }
        else if (ope==7){
            double rad=Math.toRadians(operan1);
            res = (Math.tan(rad));
        }
        pant.setText(decimales.format(res));
    }

    public void clear (View v) {
        pant.setText("");
        operan1 = 0.0;
        operan2 = 0.0;
        res = 0.0;
    }

}
