package kom.hikeside.layoutCode.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kom.hikeside.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CharacterItemBuildFragment extends Fragment {


    public CharacterItemBuildFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_item_build, container, false);
    }

}