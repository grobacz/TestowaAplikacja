package pl.grobacz.example.testowaaplikacja.szukaniepracy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.grobacz.example.testowaaplikacja.R;

/**
 * Created by grobacz on 2016-09-17.
 */
public class SzukaniePracyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_szukaniepracy, container, false);
        return v;
    }
}
