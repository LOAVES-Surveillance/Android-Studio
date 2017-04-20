package com.example.deverl.loaves_surveillance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class home extends Fragment implements View.OnClickListener {


    public home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button b = (Button) v.findViewById(R.id.live_button);
        b.setOnClickListener(this);

        b = (Button) v.findViewById(R.id.recorded_button);
        b.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.live_button:
                liveVideo lvFragment = new liveVideo();
                android.support.v4.app.FragmentTransaction lvFragmentTransaction =
                        getFragmentManager().beginTransaction();
                lvFragmentTransaction.replace(R.id.fragment_container, lvFragment);
                //lvFragmentTransaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                lvFragmentTransaction.commit();
                break;

            case R.id.recorded_button:
                Intent i = new Intent(getActivity(), googleDrive.class);
                startActivity(i);
//                googleDrive gdFragment = new googleDrive();
//                android.support.v4.app.FragmentTransaction gdFragmentTransaction =
//                        getFragmentManager().beginTransaction();
//                gdFragmentTransaction.replace(R.id.fragment_container, gdFragment);
//                //gdFragmentTransaction.addToBackStack(null);
//                gdFragmentTransaction.commit();
                break;
        }
    }

}
