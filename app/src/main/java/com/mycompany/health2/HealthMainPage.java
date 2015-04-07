package com.mycompany.health2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HealthMainPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_main_page);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_health_main_page, menu);
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
    public void sendMessage(View view)
    {
        Intent intent = new Intent(HealthMainPage.this, DoctorsVisits.class);
        startActivity(intent);
    }
    public void sendMessageMedReport(View view)
    {
        Intent intent = new Intent(HealthMainPage.this, MedicalReport.class);
        startActivity(intent);
    }
    public void sendMessageWeightLossAndDietPlan(View view)
    {
        Intent intent = new Intent(HealthMainPage.this, WeightLossAndDietPlan.class);

        startActivity(intent);
    }
}
