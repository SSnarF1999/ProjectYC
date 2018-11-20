package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class PreferencesActivity extends AppCompatActivity {
    ArrayList<String> preferences = new ArrayList<>();
    TextView final_preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        final_preferences = (TextView)findViewById(R.id.final_result);

    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.pref_vegetarian:
                if (checked) {
                    preferences.add("Vegetarian");
                }else{
                    preferences.remove("Vegetarian");
                }
                break;
            case R.id.pref_vegan:
                if (checked) {
                    preferences.add("Vegan");
                }else{
                    preferences.remove("Vegan");
                }
                break;
            case R.id.pref_lactose:
                if (checked) {
                    preferences.add("Lactose intolerance");
                }else{
                    preferences.remove("Lactose intolerance");
                }
                break;
            case R.id.pref_peanut:
                if (checked) {
                    preferences.add("Peanut allergy");
                }else{
                    preferences.remove("Peanut allergy");
                }
                break;
        }
    }

    public void finalSelection (View view) {
        String final_preferences_selection = "";

        for (String Preferences : preferences) {
            final_preferences_selection = final_preferences_selection + Preferences + "\n";
        }
        final_preferences.setText(final_preferences_selection);
    }

}
