package com.shannon.student.f4nst0p;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    //variables go here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder (View view) {
        CheckBox krustyHeadset = (CheckBox) findViewById(R.id.krusty_headset);
        boolean hasHeadset = krustyHeadset.isChecked();
        CheckBox homerPs4Skin = (CheckBox) findViewById(R.id.homer_ps4_skin);
        boolean hasHomer = homerPs4Skin.isChecked();
        CheckBox homerDonutSkin = (CheckBox) findViewById(R.id.homer_donut_skin);
        boolean hasDonut = homerDonutSkin.isChecked();
        CheckBox HomerPsvrSkin = (CheckBox) findViewById(R.id.homer_psvr_skin);
        boolean hasPsvr = HomerPsvrSkin.isChecked();
    }

}
