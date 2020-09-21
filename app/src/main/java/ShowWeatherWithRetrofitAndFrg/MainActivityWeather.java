package ShowWeatherWithRetrofitAndFrg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidtelgramconversion.R;

public class MainActivityWeather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_show_weather);
    }
}