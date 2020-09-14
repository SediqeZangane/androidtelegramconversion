package DynamicFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidtelgramconversion.R;

public class MainActivity3 extends AppCompatActivity {
    Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
        ControlView();
    }


    private void initView() {
        btnOne = findViewById(R.id.btn_One);
        btnTwo = findViewById(R.id.btn_Two);

    }

    private void ControlView() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frgOne FrgOneee = new frgOne();
                FragmentManager FMOne = getSupportFragmentManager();
                FragmentTransaction FTOne = FMOne.beginTransaction();
                FTOne.add(R.id.frg_holder, FrgOneee);
                FTOne.addToBackStack("1");
                FTOne.commit();

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frgTwo FrgTwooo = new frgTwo();
                FragmentManager FMTwo = getSupportFragmentManager();
                FragmentTransaction FTTwo = FMTwo.beginTransaction();
                FTTwo.add(R.id.frg_holder, FrgTwooo);
                FTTwo.addToBackStack(null);
                FTTwo.commit();
            }
        });

    }


}