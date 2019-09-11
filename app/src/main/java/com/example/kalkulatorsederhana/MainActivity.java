package com.example.kalkulatorsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtDisplay;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private Button btnPlusMin, btnPoint, btnClear, btnDelete, btnDiv, btnMult, btnPlus, btnMin, btnEqual;
    boolean boolPoint = false, opDiv = false, opMult = false, opMin = false, opPlus = false;
    boolean newOp = false;
    double val1, val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDisplay = (TextView) findViewById(R.id.txt_display);
        btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);
        btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);
        btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);
        btnPlusMin = (Button) findViewById(R.id.button_PlusMin);
        btnPlusMin.setOnClickListener(this);
        btnPoint = (Button) findViewById(R.id.button_Point);
        btnPoint.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.button_Clear);
        btnClear.setOnClickListener(this);
        btnDelete = (Button) findViewById(R.id.button_Delete);
        btnDelete.setOnClickListener(this);
        btnDiv = (Button) findViewById(R.id.button_Div);
        btnDiv.setOnClickListener(this);
        btnMult = (Button) findViewById(R.id.button_Mult);
        btnMult.setOnClickListener(this);
        btnPlus = (Button) findViewById(R.id.button_Plus);
        btnPlus.setOnClickListener(this);
        btnMin = (Button) findViewById(R.id.button_Min);
        btnMin.setOnClickListener(this);
        btnEqual = (Button) findViewById(R.id.button_Equal);
        btnEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_1:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("1");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"1");
                }
                break;
            case R.id.button_2:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("2");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"2");
                }
                break;
            case R.id.button_3:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("3");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"3");
                }
                break;
            case R.id.button_4:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("4");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"4");
                }
                break;
            case R.id.button_5:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("5");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"5");
                }
                break;
            case R.id.button_6:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("6");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"6");
                }
                break;
            case R.id.button_7:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("7");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"7");
                }
                break;
            case R.id.button_8:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("8");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"8");
                }
                break;
            case R.id.button_9:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("9");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"9");
                }
                break;
            case R.id.button_0:
                if(newOp){
                    txtDisplay.setText("0");
                    newOp = false;
                }
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("0");
                }else{
                    txtDisplay.setText(txtDisplay.getText()+"0");
                }
                break;
            case R.id.button_PlusMin:
                if (txtDisplay.getText().equals("0")){
                    txtDisplay.setText("0");
                }else{
                    String var = txtDisplay.getText().toString().trim();
                    double number = Double.parseDouble(var);
                    number *= -1;

                    if(Math.floor(number) == Math.ceil(number)){
                        txtDisplay.setText(""+(int)number);
                    }else{
                        txtDisplay.setText(""+number);
                    }
                }
                break;
            case R.id.button_Point:
                if(!boolPoint){
                    boolPoint = true;
                    txtDisplay.setText(txtDisplay.getText()+".");
                }
                break;
            case R.id.button_Clear:
                boolPoint = false;
                opPlus = false;
                opMult = false;
                opMin = false;
                opDiv = false;
                newOp = false;
                val1 = val2 = 0;
                txtDisplay.setText("0");
                break;
            case R.id.button_Delete:
                String var = txtDisplay.getText().toString().trim();
                int length = var.length();
                //char[] ch = var.toCharArray();
                if(length > 1){
                    if(var.charAt(length-1)=='.'){
                        boolPoint = false;
                    }
                    txtDisplay.setText(""+var.substring(0,length-1));
                }else{
                    txtDisplay.setText("0");
                }
                break;
            case R.id.button_Div:
                val1 =val2;
                var = txtDisplay.getText().toString().trim();
                val2 = Double.parseDouble(var);
                txtDisplay.setText("0");
                cekOperation();
                opDiv = true;
                break;
            case R.id.button_Mult:
                val1 =val2;
                var = txtDisplay.getText().toString().trim();
                val2 = Double.parseDouble(var);
                txtDisplay.setText("0");
                cekOperation();
                opMult = true;
                break;
            case R.id.button_Plus:
                val1 =val2;
                var = txtDisplay.getText().toString().trim();
                val2 = Double.parseDouble(var);
                txtDisplay.setText("0");
                cekOperation();
                opPlus = true;
                break;
            case R.id.button_Min:
                val1 =val2;
                var = txtDisplay.getText().toString().trim();
                val2 = Double.parseDouble(var);
                txtDisplay.setText("0");
                cekOperation();
                opMin = true;
                break;
            case R.id.button_Equal:
                val1 =val2;
                var = txtDisplay.getText().toString().trim();
                val2 = Double.parseDouble(var);
                txtDisplay.setText("0");
                cekOperation();
                break;
            default:
                break;
        }
    }

    public void  cekOperation(){
        if(opDiv){
            val2 = val1/val2;
            txtDisplay.setText(""+val2);
            opDiv = false;
            newOp = true;
        }
        if(opMin){
            val2 = val1-val2;
            txtDisplay.setText(""+val2);
            opMin = false;
            newOp = true;
        }
        if(opMult){
            val2 = val1*val2;
            txtDisplay.setText(""+val2);
            opMult = false;
            newOp = true;
        }
        if(opPlus){
            val2 = val1+val2;
            txtDisplay.setText(""+val2);
            opPlus = false;
            newOp = true;
        }
    }
}
