package com.alex.converter_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.text.DecimalFormat;
import java.util.Objects;

public class area_activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //main initialization
    TextView app_name, author_name;
    View mView;
    private DrawerLayout mDrawerLayout;

    //calculator initialization
    public Spinner spinner1,spinner2;
    public String[] areaName;
    public EditText edt1;
    public TextView result_view;
    public Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //main initialization
        Toolbar mToolbar = findViewById(R.id.iToolbar);
        setSupportActionBar(mToolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("AREA");

        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView mNavigationView = findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
        mView = mNavigationView.inflateHeaderView(R.layout.nav_header);

        app_name = mView.findViewById(R.id.app_name);
        author_name = mView.findViewById(R.id.author_name);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.nav_draw_open, R.string.nav_draw_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        //calculator initialization

        spinner1= findViewById(R.id.spinner_1);
        spinner2= findViewById(R.id.spinner_2);
        edt1= findViewById(R.id.txt_1);
        result_view= findViewById(R.id.txt_2);
        btn1= findViewById(R.id.calculate_btn);
        btn2= findViewById(R.id.reset_btn);
        areaName=getResources().getStringArray(R.array.area_string);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.temp, R.id.textviewid, areaName);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);


        //calculator eveniment
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try
                {
                    DecimalFormat fort = new DecimalFormat("#.########");
                    String c1=edt1.getText().toString();
                    double d1=Double.parseDouble(c1);
                    String s1=String.valueOf(spinner1.getSelectedItem());
                    String s2=String.valueOf(spinner2.getSelectedItem());

                    //SQUARE KILOMETRE CONVERSION
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*1000000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.386102;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*10760000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*1550000000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*100;
                        result_view.setText(""+fort.format(res));
                    }

                    //SQUARE METRE CONVERSION
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.000001;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.0000003861;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*10.7639;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*0.0001;
                        result_view.setText(""+fort.format(res));
                    }

                    //SQUARE MILE CONVERSION
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*2.58999;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*2590000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*4014000000.0;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*258.999;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*27880000;
                        result_view.setText(""+fort.format(res));
                    }

                    //HECTARE CONVERSION
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.01;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*10000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.00386;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*15500000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*107639;
                        result_view.setText(""+fort.format(res));
                    }

                    //SQUARE INCH CONVERSION

                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.00000000064516;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*0.00064516;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.0000000002491;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*0.00694444;
                        result_view.setText(""+fort.format(res));
                    }

                    //SQUARE FOOT CONVERSION

                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.000000092903;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.00000003587;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*0.0000092903;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*144;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.092903;
                        result_view.setText(""+fort.format(res));
                    }

                    if(result_view.getText().toString().equals("0"))
                    {
                        result_view.setText("ERROR");
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(area_activity.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                result_view.setText("");
            }
        });
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                Intent m1 = new Intent(this, MainActivity.class);
                startActivity(m1);
                finish();
                break;
            case R.id.nav_temperature:
                Intent m2 = new Intent(this, temperature_activity.class);
                startActivity(m2);
                finish();
                break;
            case R.id.nav_length:
                Intent m3 = new Intent(this, length_activity.class);
                startActivity(m3);
                finish();
                break;
            case R.id.nav_area:
                //Intent m4 = new Intent(this, area_activity.class);
                //startActivity(m4);
                //finish();
                break;
            case R.id.nav_volume:
                Intent m5 = new Intent(this, volume_activity.class);
                startActivity(m5);
                finish();
                break;
            case R.id.nav_speed:
                Intent m6 = new Intent(this, speed_activity.class);
                startActivity(m6);
                finish();
                break;
            case R.id.nav_weight:
                Intent m7 = new Intent(this, weight_activity.class);
                startActivity(m7);
                finish();
                break;
            case R.id.nav_time:
                Intent m8 = new Intent(this, time_activity.class);
                startActivity(m8);
                finish();
                break;
            case R.id.nav_pressure:
                Intent m9 = new Intent(this, pressure_activity.class);
                startActivity(m9);
                finish();
                break;
            case R.id.nav_power:
                Intent m10 = new Intent(this, power_activity.class);
                startActivity(m10);
                finish();
                break;
            case R.id.nav_energy:
                Intent m11 = new Intent(this, energy_activity.class);
                startActivity(m11);
                finish();
                break;
            case R.id.nav_force:
                Intent m12 = new Intent(this, force_activity.class);
                startActivity(m12);
                finish();
                break;

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.aboutid)
        {
            Intent ab=new Intent(area_activity.this, AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
