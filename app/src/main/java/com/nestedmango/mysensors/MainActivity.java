package com.nestedmango.mysensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 ListView listSen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listSen=(ListView)findViewById(R.id.list);
        SensorManager sManager = (SensorManager) this
                .getSystemService(this.SENSOR_SERVICE);
        List<Sensor> sList = sManager.getSensorList(Sensor.TYPE_ALL);

        List<String> sNames = new ArrayList();
        for (int i = 0; i < sList.size(); i++) {
            sNames.add(((Sensor) sList.get(i)).getName());
        }



    }
    public void git(){

    }
}
