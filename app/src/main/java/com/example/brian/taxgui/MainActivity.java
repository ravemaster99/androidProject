package com.example.brian.taxgui;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText zipCode;
    String url = "http://realprice.bramsoft.com/index.php?zip=";
    String zip_code = "";
    Button getRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    class RetrieveFileTask extends AsyncTask<String, Void, Integer> {
        private Exception exception;

        protected Integer doInBackground(String... urls) {
            try {
                URL textUrl;
                String newUrl = url + "";
                textUrl = new URL(url);

                return 1;
            } catch (Exception e) {
                this.exception = e;
                Log.i("bum", "hi: " + e);
                return 1;
            }
        }

        protected void onPostExecute(Integer result) {
            // TODO: check this.exception
            // TODO: do something with the feed
            textView.setText(stringList.get(0).toString());
        }
    }

    void bindViews(){

        zipCode = (EditText) findViewById(R.id.zipCodeInput_fld);
        getRate = (Button) findViewById(R.id.getRate_btn);

    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }



}
