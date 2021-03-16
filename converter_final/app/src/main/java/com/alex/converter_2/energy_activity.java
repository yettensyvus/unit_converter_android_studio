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

public class energy_activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //main initialization
    TextView app_name, author_name;
    View mView;
    private DrawerLayout mDrawerLayout;

    //calculator initialization
    public Spinner spinner1,spinner2;
    public String[] energyName;
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("ENERGY");

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
        energyName=getResources().getStringArray(R.array.energy_string);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.temp, R.id.textviewid, energyName);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);


        //calculator eveniment
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try
                {
                    DecimalFormat fort=new DecimalFormat("#.########");
                    String c1=edt1.getText().toString();
                    double d1=Double.parseDouble(c1);
                    String s1=String.valueOf(spinner1.getSelectedItem());
                    String s2=String.valueOf(spinner2.getSelectedItem());

                    //JOULE CONVERSION
                    if(s1.contentEquals("JOULE") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*0.000001;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*0.000000001;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*0.239006;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*0.000239;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*0.00000023901;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("THERM"))
                    {
                        double res=d1*0.0000000094782;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*9.4782E-19;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("JOULE") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*6.2415E+18;
                        result_view.setText(""+fort.format(res));
                    }

                    //MEGAJOULE CONVERSION
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*1000000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*0.001;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*239005.736138;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*239.005736;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*0.239006;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("THERM"))
                    {
                        double res=d1*0.009478;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*9.4782E-13;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGAJOULE") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*6.2415E+24;
                        result_view.setText(""+fort.format(res));
                    }

                    //GIGAJOULE CONVERSION
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*1000000000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*1000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*239005736.13767;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*239005.736138;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*239.005736;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("THERM"))
                    {
                        double res=d1*9.478171;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*9.4782E-10;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GIGAJOULE") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*6.2415E+27;
                        result_view.setText(""+fort.format(res));
                    }

                    //CALORIES CONVERSION

                    if(s1.contentEquals("CALORIES") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*4.184;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*4.184E-6;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*4.184E-9;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*0.001;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*1.0E-6;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("THERM"))
                    {
                        double res=d1*3.9657E-8;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*3.9657E-18;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CALORIES") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*2.6114E+19;
                        result_view.setText(""+fort.format(res));
                    }

                    //KILOCALORIES CONVERSION
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*4184;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*0.004184;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*4.184E-6;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*1000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*0.001;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("THERM"))
                    {
                        double res=d1*3.9657E-5;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*3.9657E-15;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOCALORIES") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*2.6114E+22;
                        result_view.setText(""+fort.format(res));
                    }

                    //MEGACALORIES CONVERSION
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*4184000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*4.184;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*0.004184;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*1000000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*1000;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("THERM"))
                    {
                        double res=d1*0.039657;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*3.9657E-12;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MEGACALORIES") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*2.6114E+25;
                        result_view.setText(""+fort.format(res));
                    }

                    //THERM CONVERSION
                    if(s1.contentEquals("THERM") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*105505585.262;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*105.505585;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*0.105506;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*25216440.07218;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*25216.440072;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*25.21644;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*1.0E-10;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("THERM") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*6.5851E+26;
                        result_view.setText(""+fort.format(res));
                    }

                    //QUAD CONVERSION
                    if(s1.contentEquals("QUAD") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*1.0551E+18;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*1055055852620L;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*1055055852.62;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*2.5216E+17;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*2.5216E+14;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*252164400721.8;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("THERM"))
                    {
                        double res=d1*10000000000L;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("QUAD") && s2.contentEquals("ELECTRONVOLT"))
                    {
                        double res=d1*6.5851E+36;
                        result_view.setText(""+fort.format(res));
                    }

                    //ELECTRONVOLT CONVERSION
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("JOULE"))
                    {
                        double res=d1*1.6022E-19;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("MEGAJOULE"))
                    {
                        double res=d1*1.6022E-25;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("GIGAJOULE"))
                    {
                        double res=d1*1.6022E-28;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("CALORIES"))
                    {
                        double res=d1*3.8293E-20;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("KILOCALORIES"))
                    {
                        double res=d1*3.8293E-23;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("MEGACALORIES"))
                    {
                        double res=d1*3.8293E-26;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("THERM"))
                    {
                        double res=d1*1.5186E-27;
                        result_view.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("ELECTRONVOLT") && s2.contentEquals("QUAD"))
                    {
                        double res=d1*1.5186E-37;
                        result_view.setText(""+fort.format(res));
                    }


                    if(result_view.getText().toString().equals("0"))
                    {
                        result_view.setText("ERROR");
                    }

                }catch(Exception e)
                {
                    Toast.makeText(energy_activity.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
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
                Intent m4 = new Intent(this, area_activity.class);
                startActivity(m4);
                finish();
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
               // Intent m11 = new Intent(this, energy_activity.class);
               // startActivity(m11);
                //finish();
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
            Intent ab=new Intent(energy_activity.this, AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
