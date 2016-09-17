package pl.grobacz.example.testowaaplikacja.dagger;

import javax.inject.Singleton;

import dagger.Component;
import pl.grobacz.example.testowaaplikacja.MainActivity;

/**
 * Created by grobacz on 2016-09-17.
 */

@Component(
        modules = {
                AppModule.class,
                SzukaniePracyModule.class
        }
)
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);

}