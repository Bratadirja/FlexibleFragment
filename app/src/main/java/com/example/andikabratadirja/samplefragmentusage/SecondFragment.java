package com.example.andikabratadirja.samplefragmentusage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    Button btnSecondFragment;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        btnSecondFragment = (Button) view.findViewById(R.id.btn_second_fragment);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Second Fragment");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, new ThirdFragment(), ThirdFragment.class.getSimpleName())
                        .addToBackStack(null).commit();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        if (Item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(Item);
    }

}
