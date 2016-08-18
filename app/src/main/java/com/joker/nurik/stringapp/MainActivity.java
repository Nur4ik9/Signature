package com.joker.nurik.stringapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView);

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        if (id == R.id.compareTo) {

            if (s1.compareTo(s2) == 0) {
                tv.setText("Строки совпадают с учетом регистра");
            } else {
                tv.setText("Строки не совпадают с учетом регистра");
            }
        }

        if (id == R.id.compareToIgnoreCase) {

            if (s1.compareToIgnoreCase(s2) == 0) {
                tv.setText("Строки совпадают без учета регистра");
            } else {
                tv.setText("Строки с учетом регистра");
            }
        }

        if (id == R.id.contains) {
            CharSequence q = s2;
            if (s1.contains(q)) {
                tv.setText("Указанная последовательность входит в строку");
            } else {
                tv.setText("Указанная последовательность не входит в строку ");
            }
        }

        if (id == R.id.endsWith) {

            if (s1.endsWith(s2)) {
                tv.setText("Строки завершаеются суфиксом");
            } else {
                tv.setText("Строки не завершаются суфиксом");
            }
        }

        if (id == R.id.startsWith) {

            if (s1.startsWith(s2)) {
                tv.setText("Строки совпадают без учета регистра");
            } else {
                tv.setText("Строки с учетом регистра");
            }
        }
        if (id == R.id.equals) {

            if (s1.equals(s2)) {
                tv.setText("Строка начинается с префикса");
            } else {
                tv.setText("Строка не начинается с префикса");
            }
        }

        if (id == R.id.indexOff) {

           int q = s1.indexOf(s2); // 1 строка - йцукенц  2 строка ц
            tv.setText(q);
        }

        if (id == R.id.replace) {
            tv.setText(s1.replace("жы", "жи"));
        }

        if (id == R.id.substring) {
            tv.setText(s1.replace("10", "15"));
        }

        if (id == R.id.toLowerCase) {
            tv.setText(s1.toLowerCase());
        }

        if (id == R.id.toUpperCase) {
            tv.setText(s1.toUpperCase());
        }

        if (id == R.id.trim) {
            tv.setText(s1.trim());
        }

        if (id == R.id.split) {

            String strMas[];//etString = Потолок:Дверь:Окно  etString = ":"
            String res = "";
            strMas = s1.split(s2);//["ПОтолок", "Дверь"]
            for (int i = 0; i < strMas.length; i++) {
                res.concat("*").concat(strMas[i]);  //ПОтолок*Дверь*Окно
            }
            tv.setText(res);
        }

        if (id == R.id.trim) {
            tv.setText(s1.trim());
        }

        if (id == R.id.even) {
            String s = num1;
            String[] masS;
            String result = "";
            masS = s.split("#");

            for (int i = 0; i < masS.length; i++) {

                if (Integer.valueOf(masS[i]) % 2 == 0) {
                    result = result + masS[i] + " ";
                }
            }
            if (result.equals("")) {
                result = "четных чисел нет";
            }

            tv.setText(String.valueOf(result));
        }

        return super.onOptionsItemSelected(item);
    }
}
/* if id == R.id.sqrt

        long sqrt = long.valuesOf(etString)
        tv.setText("квадратный корень" + mathPI*/