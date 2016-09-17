package pl.grobacz.example.testowaaplikacja;

import android.app.Application;

import pl.grobacz.example.testowaaplikacja.dagger.AppComponent;
import pl.grobacz.example.testowaaplikacja.dagger.AppModule;
import pl.grobacz.example.testowaaplikacja.dagger.DaggerAppComponent;

/**
 * Created by grobacz on 2016-09-17.
 */
public class TestingApplication extends Application {

    //private static TestingApplication instance = new TestingApplication();
    private static AppComponent mAppComponent;

    /*public static TestingApplication getInstance() {
        return instance;
    }*/

    @Override
    public void onCreate(){
        super.onCreate();

        getAppComponent();
    }

    public AppComponent getAppComponent() {
        if (mAppComponent == null){
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return mAppComponent;
    }
}
