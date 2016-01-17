package com.example.felhasznalo.malom;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;


public class malom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malom);


        View hatter = findViewById(R.id.Hatter);
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)hatter.getLayoutParams();
        params.width = Math.round(WidthToDp(100));
        params.height = Math.round(HeightToDp(74));
        hatter.setLayoutParams(params);

        BabuKezelo.Instance().Betoltes(this);
    }

    private float WidthToDp(int width)
    {
        int szelesszeg = GetWidth();
        float percent = (float)width / 100;
        float vissza = (float)szelesszeg * percent;
        return vissza;
    }


    private float HeightToDp(int height)
    {
        int magassag = GetHeight();
        float percent = (float)height / 100;
        float vissza = (float)magassag * percent;
        return vissza;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_malom, menu);
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

    private int GetWidth()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        return width;
    }

    private int GetHeight()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        return height;
    }

    public void button0Click(View v)
    {
        BabuKezelo.Instance().Kattintas(0, this);
    }

    public void button1Click(View v)
    {
        BabuKezelo.Instance().Kattintas(1, this);
    }

    public void button2Click(View v)
    {
        BabuKezelo.Instance().Kattintas(2, this);
    }

    public void button3Click(View v)
    {
        BabuKezelo.Instance().Kattintas(3, this);
    }

    public void button4Click(View v)
    {
        BabuKezelo.Instance().Kattintas(4, this);
    }

    public void button5Click(View v)
    {
        BabuKezelo.Instance().Kattintas(5, this);
    }

    public void button6Click(View v)
    {
        BabuKezelo.Instance().Kattintas(6, this);
    }

    public void button7Click(View v)
    {
        BabuKezelo.Instance().Kattintas(7, this);
    }

    public void button8Click(View v)
    {
        BabuKezelo.Instance().Kattintas(8, this);
    }

    public void button9Click(View v)
    {
        BabuKezelo.Instance().Kattintas(9, this);
    }

    public void button10Click(View v)
    {
        BabuKezelo.Instance().Kattintas(10, this);
    }

    public void button11Click(View v)
    {
        BabuKezelo.Instance().Kattintas(11, this);
    }

    public void button12Click(View v)
    {
        BabuKezelo.Instance().Kattintas(12, this);
    }

    public void button13Click(View v)
    {
        BabuKezelo.Instance().Kattintas(13, this);
    }

    public void button14Click(View v)
    {
        BabuKezelo.Instance().Kattintas(14, this);
    }

    public void button15Click(View v)
    {
        BabuKezelo.Instance().Kattintas(15, this);
    }

    public void button16Click(View v)
    {
        BabuKezelo.Instance().Kattintas(16, this);
    }

    public void button17Click(View v)
    {
        BabuKezelo.Instance().Kattintas(17, this);
    }

    public void button18Click(View v)
    {
        BabuKezelo.Instance().Kattintas(18, this);
    }

    public void button19Click(View v)
    {
        BabuKezelo.Instance().Kattintas(19, this);
    }

    public void button20Click(View v)
    {
        BabuKezelo.Instance().Kattintas(20, this);
    }

    public void button21Click(View v)
    {
        BabuKezelo.Instance().Kattintas(21, this);
    }

    public void button22Click(View v)
    {
        BabuKezelo.Instance().Kattintas(22, this);
    }

    public void button23Click(View v)
    {
        BabuKezelo.Instance().Kattintas(23, this);
    }

    public void buttonDontetlen(View v)
    {
        BabuKezelo.Instance().Dontetlen(this);
    }

    public void buttonNullaz(View v)
    {
        BabuKezelo.Instance().Nullaz(this);
    }

    public void buttonBugReport(View v)
    {
        goToUrl ("http://users.atw.hu/weblapjaim3/bugreport/index.php");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
