package com.example.darkheart.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final double[] total = {0};
        double tmp = 0;
        final boolean[] calcPressed = {false}; //when calculation is required
        final int[] init = {0};
        final boolean[] calcPlus = {false};
        final boolean[] calcMinus = {false};
        final boolean[] calcMult = {false};
        final boolean[] calcDiv = {false};
        final boolean[] decimal = {false}; //when is about to enter decimal
        final boolean[] begin = {true};

        //Numerical Buttons
        Button Button9 = (Button)findViewById(R.id.number9);
        Button Button8 = (Button)findViewById(R.id.number8);
        Button Button7 = (Button)findViewById(R.id.number7);
        Button Button6 = (Button)findViewById(R.id.number6);
        Button Button5 = (Button)findViewById(R.id.number5);
        Button Button4 = (Button)findViewById(R.id.number4);
        Button Button3 = (Button)findViewById(R.id.number3);
        Button Button2 = (Button)findViewById(R.id.number2);
        Button Button1 = (Button)findViewById(R.id.number1);
        Button Button0 = (Button)findViewById(R.id.number0);

        //Operational Buttons
        Button ButtonDecimal = (Button)findViewById(R.id.decimal);
        Button ButtonAddition = (Button)findViewById(R.id.buttAdd);
        Button ButtonMinus = (Button)findViewById(R.id.buttMinus);
        Button ButtonMultiply = (Button)findViewById(R.id.buttMultiply);
        Button ButtonDiv = (Button)findViewById(R.id.buttDiv);
        Button ButtonClear = (Button)findViewById(R.id.buttClear);
        Button ButtonEqual = (Button)findViewById(R.id.buttEqual);

        ButtonClear.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                total[0] = 0;
                init[0] = 0;
                decimal[0] = false;
                begin[0] = true;
                calcPressed[0] = false;
                calcPlus[0] = false;
                calcMinus[0] = false;
                calcMult[0] = false;
                calcDiv[0] =false;

                Total.setText("0");


            }
        });

        Button9.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                Log.v("", "" + begin[0]);

                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {

                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                    //init[0]++;
                    //|| ( (init[0] == 0) ) ||
                }

                Total.setText(prevText+"9");


            }
        });

        Button8.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();


                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"8");

            }
        });

        Button7.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();


                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"7");

            }
        });

        Button6.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString() +"6");

            }
        });

        Button5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"5");

            }
        });

        Button4.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"4");

            }
        });

        Button3.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"3");

            }
        });

        Button2.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();


                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"2");

            }
        });

        Button1.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();


                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"1");

            }
        });

        Button0.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();


                if( ( (calcPressed[0])  || ( (begin[0]) )) && (!decimal[0]) ) {
                    prevText = "";
                    calcPressed[0] = false;
                    begin[0] = false;
                }

                Total.setText(prevText.toString()+"0");

            }
        });


        ButtonAddition.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                calcPressed[0] = true;
                init[0]++;


                if(init[0] >= 2){
                    if(calcMinus[0]) {
                        total[0] = total[0] - Double.parseDouble(prevText.toString());

                        calcMinus[0] = false;
                    }else if(calcMult[0]){

                        total[0] = total[0] * Double.parseDouble(prevText.toString());

                        calcMult[0] = false;

                    }else if(calcDiv[0]){

                        total[0] = total[0] / Double.parseDouble(prevText.toString());

                        calcDiv[0] = false;

                    }else
                        total[0] = total[0] + Double.parseDouble(prevText.toString());
                    Total.setText( Double.valueOf(total[0]).toString() );
                }else{
                    total[0] = Double.parseDouble(prevText.toString());
                }

                if( (total[0] > 999999999) || total[0] < -99999999 ){
                    Total.setText("No space!!");
                    return;
                }


                if( total[0] % 1 == 0 )
                    Total.setText(Integer.valueOf((int) total[0]).toString());
                else
                    Total.setText(Double.valueOf(total[0]).toString());

                calcPlus[0] = true;
                decimal[0] = false;

            }
        });

        ButtonMinus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                calcPressed[0] = true;
                init[0]++;

                if(init[0] >= 2){
                    if(calcPlus[0]) {
                        total[0] = total[0] + Double.parseDouble(prevText.toString());

                        calcPlus[0] = false;
                    }else if(calcMult[0]){
                        total[0] = total[0] * Double.parseDouble(prevText.toString());

                        calcMult[0] = false;
                    }else if(calcDiv[0]){

                        total[0] = total[0] / Double.parseDouble(prevText.toString());

                        calcDiv[0] = false;

                    }else
                        total[0] = total[0] - Double.parseDouble(prevText.toString());
                        Total.setText( Double.valueOf(total[0]).toString() );
                }else{
                    total[0] = Double.parseDouble(prevText.toString());
                }

                if( (total[0] > 999999999) || total[0] < -99999999 ){
                    Total.setText("No space!!");
                    return;
                }



                if( total[0] % 1 == 0 )
                    Total.setText(Integer.valueOf((int) total[0]).toString());
                else
                    Total.setText(Double.valueOf(total[0]).toString());

                calcMinus[0] = true;

            }
        });

        ButtonMultiply.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                calcPressed[0] = true;
                init[0]++;

                if(init[0] >= 2){
                    if(calcPlus[0] ) {
                        total[0] = total[0] + Double.parseDouble(prevText.toString());

                        calcPlus[0] = false;
                    }else if(calcMinus[0] ) {
                        total[0] = total[0] - Double.parseDouble(prevText.toString());

                        calcMinus[0] = false;
                    }else if(calcDiv[0]){

                        total[0] = total[0] / Double.parseDouble(prevText.toString());

                        calcDiv[0] = false;

                    }else {

                        total[0] = total[0] = total[0] * Double.parseDouble(prevText.toString());
                        Total.setText(Double.valueOf(total[0]).toString());
                    }
                }else{
                    total[0] = Double.parseDouble(prevText.toString());
                }

                if( (total[0] > 999999999) || total[0] < -99999999 ){
                    Total.setText("No space!!");
                    return;
                }

                if( total[0] % 1 == 0 )
                    Total.setText(Integer.valueOf((int) total[0]).toString());
                else
                    Total.setText(Double.valueOf(total[0]).toString());

                calcMult[0] = true;

            }
        });

        ButtonDiv.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                calcPressed[0] = true;
                init[0]++;

                if(init[0] >= 2){
                    if(calcPlus[0]) {
                        total[0] = total[0] + Double.parseDouble(prevText.toString());

                        calcPlus[0] = false;
                    }else if(calcMinus[0] ) {
                        total[0] = total[0] - Double.parseDouble(prevText.toString());

                        calcMinus[0] = false;
                    }else if(calcMult[0] ) {
                        total[0] = total[0] * Double.parseDouble(prevText.toString());

                        calcMinus[0] = false;
                    }else{
                        total[0] = total[0] / Double.parseDouble(prevText.toString());
                    }

                }else{
                    total[0] = Double.parseDouble(prevText.toString());
                }

                if( (total[0] > 999999999) || total[0] < -99999999 ){
                    Total.setText("No space!!");
                    return;
                }

                if( total[0] % 1 == 0 )
                    Total.setText(Integer.valueOf((int) total[0]).toString());
                else
                    Total.setText(Double.valueOf(total[0]).toString());

                calcDiv[0] = true;
            }
        });

        ButtonEqual.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();

                calcPressed[0] = true;

                if(calcPlus[0] ) {
                    total[0] = total[0] + Double.parseDouble(prevText.toString());

                }else if(calcMult[0] ){
                    total[0] = total[0] * Double.parseDouble(prevText.toString());

                }else if(calcDiv[0] ){

                    total[0] = total[0] / Double.parseDouble(prevText.toString());

                }else if(calcMinus[0] ) {
                    total[0] = total[0] - Double.parseDouble(prevText.toString());
                }

                calcPlus[0] = false;
                calcMult[0] = false;
                calcDiv[0] = false;
                calcMinus[0] = false;
                calcPressed[0] = false;
                decimal[0] = false;
                init[0] = 0;
                begin[0] = true;

                if( (total[0] > 999999999) || total[0] < -99999999 ){
                    Total.setText("No space!!");
                    return;
                }


                if( total[0] % 1 == 0 )
                    Total.setText(Integer.valueOf((int) total[0]).toString());
                else
                    Total.setText(Double.valueOf(total[0]).toString());

            }
        });


        ButtonDecimal.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                TextView Total = (TextView)findViewById(R.id.totalView);
                CharSequence prevText = Total.getText();


                if(calcPressed[0] ){
                    prevText = "";
                    calcPressed[0] = false;
                }

                decimal[0] = true;

                Total.setText(prevText+".");

            }
        });


    }
}
