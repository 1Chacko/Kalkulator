package com.example.jakub.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class AdvancedActivity extends AppCompatActivity {

    private TextView display;
    private TextView operando;
    private String firstNumber = "";
    private String secondNumber = "";
    private String resultNumber = "";
    private String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        final Button tv1 = (Button) findViewById(R.id.button13);
        final Button tv2 = (Button) findViewById(R.id.button9);
        final Button tv3 = (Button) findViewById(R.id.button8);
        final Button tv4 = (Button) findViewById(R.id.button7);

        tv2.post(new Runnable()
        {
            @Override
            public void run()
            {
                tv2.setWidth(tv1.getWidth());
            }
        });

        tv3.post(new Runnable()
        {
            @Override
            public void run()
            {
                tv3.setWidth(2*tv1.getWidth());
            }
        });

        tv4.post(new Runnable()
        {
            @Override
            public void run()
            {
                tv4.setWidth(tv1.getWidth());
            }
        });

        display = (TextView) findViewById(R.id.resultt);
        operando = (TextView) findViewById(R.id.operand);
    }

    private void putNumber(String nmb) {
        this.resultNumber = "";
        String s = display.getText().toString();

        if(operation.equals("")) {
            if (s.equals("0") || firstNumber.equals("")) {
                display.setText(nmb);
                firstNumber = nmb;
            } else {
                display.append(nmb);
                firstNumber = s + nmb;
            }
        } else {
            if (s.equals("0") || secondNumber.equals("")) {
                display.setText(nmb);
                secondNumber = nmb;
            } else {
                display.append(nmb);
                secondNumber = s + nmb;
            }
        }
    }

    public void putZero(View view) {
        putNumber("0");
    }

    public void putOne(View view) {
        putNumber("1");
    }

    public void putTwo(View view) {
        putNumber("2");
    }

    public void putThree(View view) {
        putNumber("3");
    }

    public void putFour(View view) {
        putNumber("4");
    }

    public void putFive(View view) {
        putNumber("5");
    }

    public void putSix(View view) {
        putNumber("6");
    }

    public void putSeven(View view) {
        putNumber("7");
    }

    public void putEight(View view) {
        putNumber("8");
    }

    public void putNine(View view) {
        putNumber("9");
    }

    public void clear(View view) {
        display.setText("0");
        operando.setText("");
        firstNumber = "";
        secondNumber = "";
        resultNumber = "";
        operation = "";
    }

    public void add(View view) {
        if(!resultNumber.equals("")){
            this.firstNumber = resultNumber;
        }

        if(!firstNumber.equals("")) {
            operando.setText("+");
            operation = "+";
        }
    }

    public void subtract(View view) {
        if(!resultNumber.equals("")){
            this.firstNumber = resultNumber;
        }

        if(!firstNumber.equals("")) {
            operando.setText("-");
            operation = "-";
        }
    }

    public void multiply(View view) {
        if(!resultNumber.equals("")){
            this.firstNumber = resultNumber;
        }

        if(!firstNumber.equals("")) {
            operando.setText("*");
            operation = "*";
        }
    }

    public void divide(View view) {
        if(!resultNumber.equals("")){
            this.firstNumber = resultNumber;
        }

        if(!firstNumber.equals("")) {
            operando.setText("/");
            operation = "/";
        }
    }

    public void sinus(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.sin(number);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void cosinus(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.cos(number);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void tangens(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.tan(number);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void logarytm(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.log10(number);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void ln(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.log(number);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void pierwiastek(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.sqrt(number);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void power2(View view) {
        if(!firstNumber.equals("")) {
            double number = parseDouble(firstNumber);
            number = Math.pow(number, 2);
            String wyn = String.valueOf(number);
            display.setText(wyn);
            firstNumber = "";
        }
    }

    public void powerToPower(View view) {
        if(!resultNumber.equals("")){
            this.firstNumber = resultNumber;
        }

        if(!firstNumber.equals("")) {
            operando.setText("^");
            operation = "^";
        }
    }

    public void dot(View view) {
        String s = display.getText().toString();

        if(!firstNumber.contains(".")) {
            if(operation.equals("") && s.equals("0") && firstNumber.equals("")) {
                display.setText("0.");
                firstNumber = s + ".";
            } else if(operation.equals("") && !firstNumber.equals("")) {
                display.append(".");
                firstNumber = s + ".";
            }
        }

        if(!secondNumber.contains(".")) {
            if (!operation.equals("") && !secondNumber.equals("")) {
                display.append(".");
                secondNumber = s + ".";
            }
        }
    }

    public void back(View view) {
        String s = display.getText().toString();

        if(operation.equals("")) {
            if (!s.equals("0") && !firstNumber.equals("")) {
                display.setText(s.substring(0, s.length()-1));
                firstNumber = s.substring(0, s.length()-1);
            }
        } else {
            if (!secondNumber.equals("")) {
                display.setText(s.substring(0, s.length()-1));
                secondNumber = s.substring(0, s.length()-1);
            }
        }
    }

    public void changeSign(View view) {
        String s = display.getText().toString();

        if(operation.equals("")) {
            if (!s.equals("0") && !firstNumber.equals("")) {
                if(s.contains("-")) {
                    display.setText(s.substring(1, s.length()));
                    firstNumber = s.substring(1, s.length());
                } else {
                    display.setText("-" + s);
                    firstNumber = "-" + s;
                }
            }
        } else {
            if (!s.equals("0") && !secondNumber.equals("")) {
                if(s.contains("-")) {
                    display.setText(s.substring(1, s.length()));
                    secondNumber = s.substring(1, s.length());
                } else {
                    display.setText("-" + s);
                    secondNumber = "-" + s;
                }
            }
        }
    }

    public void equal(View view) {
        if (!secondNumber.equals("")) {

            Double jeden = parseDouble(firstNumber);
            Double dwa = parseDouble(secondNumber);
            Double wynik = 0.0;
            boolean isDivided = true;

            if (operation.equals("+")) {
                wynik = jeden + dwa;
            }

            if (operation.equals("-")) {
                wynik = jeden - dwa;
            }

            if (operation.equals("*")) {
                wynik = jeden * dwa;
            }

            if (operation.equals("/")) {
                wynik = jeden / dwa;
                if(jeden % dwa != 0) {
                    isDivided = false;
                }
            }

            if (operation.equals("^")) {
                wynik = Math.pow(jeden, dwa);
            }

            String wyn = String.valueOf(wynik);
            if(!firstNumber.contains(".") && !secondNumber.contains(".") && isDivided) {
                wyn = wyn.substring(0, wyn.length()-2);
            }
            display.setText(wyn);
            operando.setText("");
            firstNumber = "";
            secondNumber = "";
            resultNumber = wyn;
            operation = "";
        }
    }
}
