package com.example.deverl.loaves_surveillance;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class settings extends Fragment implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.apply_settings_button:
                //TODO
                break;
        }

    }

    public settings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_settings, container, false);

        // Inflate the layout for this fragment

        Button b = (Button) v.findViewById(R.id.apply_settings_button);
        b.setOnClickListener(this);

        return v;
    }

}
