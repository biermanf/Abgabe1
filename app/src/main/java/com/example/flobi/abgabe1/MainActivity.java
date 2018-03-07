package com.example.flobi.abgabe1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calc;
    EditText word;
    TextView isPalindrome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = (Button)findViewById(R.id.buttonCheck);
        word = (EditText)findViewById(R.id.editTextWord);
        isPalindrome = (TextView)findViewById(R.id.textViewIsPal);

    }
    public void checkPalindrome(View v)
    {
        String str;

        str = word.getText().toString();
        str = str.toLowerCase().toString();

        if(str.isEmpty())
        {
            isPalindrome.setText("AUWEEEEEEEEEEEH da steht nix");
            isPalindrome.setTextColor(Color.RED);
            isPalindrome.setVisibility(View.VISIBLE);
        }
        else if(str.contains(" "))
        {
            isPalindrome.setText("AUWEEEEEEEEEEEH Leerzeichen san nit sooo geil");
            isPalindrome.setTextColor(Color.RED);
            isPalindrome.setVisibility(View.VISIBLE);
        }
        else if(str.length() < 5) {
            isPalindrome.setText("AUWEEEEEEEEEEEH Wortlänge muass mind. 5 sein");
            isPalindrome.setTextColor(Color.RED);
            isPalindrome.setVisibility(View.VISIBLE);
        }
        else
        {
            if (checkPal(str)) {
                isPalindrome.setText("WÖÖÖÖÖÖÖÖÖÖÖÖLT ein Palindrom");
                isPalindrome.setVisibility(View.VISIBLE);
                isPalindrome.setTextColor(Color.GREEN);
            }
            else {
                isPalindrome.setText("AUWEEEEEEEEEEEH kein Palindrom");
                isPalindrome.setTextColor(Color.RED);
                isPalindrome.setVisibility(View.VISIBLE);
            }
        }
    }
    public boolean checkPal(String str)
    {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
