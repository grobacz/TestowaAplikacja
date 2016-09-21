package pl.grobacz.example.testowaaplikacja.szukaniepracy.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by grobacz on 2016-09-20.
 */
public class JUnitTestObjectSzukaniePracyTest {

    JUnitTestObjectSzukaniePracy testO;

    @Before
    public void setUp() throws Exception {
        testO = new JUnitTestObjectSzukaniePracy(10, "nazwa", "adres/bla", false);
    }

    @Test
    public void testGetName() throws Exception {
        assertThat(testO.getName(), is("nazwa"));
    }

    @Test
    public void testSetName() throws Exception {
        testO.setName("nazwa");
        assertThat(testO.getName(), is("bla_nazwa"));
    }

    @Test
    public void testIsRegistered() throws Exception {
        assertThat(testO.isRegistered(), is(false));
    }
}