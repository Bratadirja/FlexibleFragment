package com.example.andikabratadirja.samplefragmentusage;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private Button btnFirstFragment;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btnFirstFragment = (Button)view.findViewById(R.id.btn_first_fragment);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("First Fragment");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        return view;

    }

    @Override
    public void onActivityCreated(Bundle sevedInstanceState){
        super.onActivityCreated(sevedInstanceState);

        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .replace(R.id.frame_container, new SecondFragment(), SecondFragment.class.getSimpleName())
                        .addToBackStack(null).commit();
            }
        });
    }

}
