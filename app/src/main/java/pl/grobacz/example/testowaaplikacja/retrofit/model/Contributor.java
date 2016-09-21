package pl.grobacz.example.testowaaplikacja.retrofit.model;

/**
 * Created by grobacz on 2016-09-20.
 */
public class Contributor {

    String login;
    String html_url;

    int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}
