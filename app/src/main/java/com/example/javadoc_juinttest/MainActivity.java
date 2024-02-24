package com.example.javadoc_juinttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Meme
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {
private TextView txt;
private EditText edt;
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        edt=(EditText) findViewById(R.id.editText);



        btn.setOnClickListener(e->{
            String password=edt.getText().toString();
            if (checkLength(password)){
              if(checkUpper(password))
              {
                  Toast.makeText(this, "Accepted length", Toast.LENGTH_SHORT).show();
                txt.setText("That is okay");}
              else{
                  Toast.makeText(this,  "missing upper case", Toast.LENGTH_SHORT).show();
                  txt.setText("Try again , the password must contain an upper case");
              }
            }else{
                Toast.makeText(this,  "Unaccepted length", Toast.LENGTH_SHORT).show();
                txt.setText("Try again , the password length should be more than 8 character ");
            }

        });



    }

    /**
     *
     * @param pw
     * @return
     */
    public  boolean checkLength(String pw){
        return((pw.length()>=8));

    }


    /**
     *
     * @param pw
     * @return
     */
    public  boolean checkUpper(String pw){
        for(int op=0; op<pw.length();op++)
        {
            if(Character.isUpperCase(pw.charAt(op)))
                return true;
        }
        return false;
    }

}