package pl.grobacz.example.testowaaplikacja.szukaniepracy;

import android.support.v4.app.Fragment;

import pl.grobacz.example.testowaaplikacja.SingleFragmentActivity;

/**
 * Created by grobacz on 2016-09-17.
 */
public class SzukaniePracyActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new SzukaniePracyFragment();
    }
}
