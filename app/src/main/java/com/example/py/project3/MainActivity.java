package com.example.py.project3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btnAmend = (Button) findViewById(R.id.ButtonAmend);
        final EditText edittext = (EditText) findViewById(R.id.editTextSS);

        btnAmend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("Hi!");
            }
        });
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView tv=(TextView)findViewById(R.id.txtHello);

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxChi:
                if(checked){
                    Toast.makeText(this,"选择中文",Toast.LENGTH_LONG).show();
                    tv.setText("你好！");
                }else{
                    Toast.makeText(this,"取消选择中文",Toast.LENGTH_LONG).show();
                    tv.setText("Hello!");
                }
                break;
            case R.id.checkBoxGem:
                if(checked){
                    Toast.makeText(this,"选择德语",Toast.LENGTH_LONG).show();
                    tv.setText("Ciao!");
                }else{
                    Toast.makeText(this,"取消选择德语",Toast.LENGTH_LONG).show();
                    tv.setText("Hello!");
                }
                break;
            case R.id.checkBoxJap:
                if(checked){
                    Toast.makeText(this,"选择日语",Toast.LENGTH_LONG).show();
                    tv.setText("こんにちは");
                }else{
                    Toast.makeText(this,"取消选择日语",Toast.LENGTH_LONG).show();
                    tv.setText("Hello!");
                }
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView tv=(TextView)findViewById(R.id.txtHello);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonYes:
                if (checked)
                    tv.setText("Bye!");
                break;
            case R.id.radioButtonNo:
                if (checked)
                    tv.setText("Hello!");
                break;
        }
    }
}
