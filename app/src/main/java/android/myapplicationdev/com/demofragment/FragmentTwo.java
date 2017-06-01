package android.myapplicationdev.com.demofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    Button btnAddText;
    TextView tvFrag1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        tvFrag1 = (TextView) view.findViewById(R.id.fragmentTwoTv);
        btnAddText = (Button) view.findViewById(R.id.fragmentTwoBtn);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data F Two";
                tvFrag1.setText(data);
            }
        });

        return view;
    }
}