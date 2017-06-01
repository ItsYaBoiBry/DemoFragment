package android.myapplicationdev.com.demofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment fOne = new FragmentFirst();
        Fragment fTwo = new FragmentTwo();
        ft.replace(R.id.frameOne,fOne);
        ft.replace(R.id.frameTwo,fTwo);

        ft.commit();
    }
}
