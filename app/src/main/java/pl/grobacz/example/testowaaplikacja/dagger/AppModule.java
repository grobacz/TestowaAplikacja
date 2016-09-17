package pl.grobacz.example.testowaaplikacja.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.grobacz.example.testowaaplikacja.TestingApplication;

/**
 * Created by grobacz on 2016-09-17.
 */
@Module
public class AppModule {
    private final TestingApplication mApplication;

    public AppModule(TestingApplication app){
        mApplication = app;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return mApplication;
    }
}
