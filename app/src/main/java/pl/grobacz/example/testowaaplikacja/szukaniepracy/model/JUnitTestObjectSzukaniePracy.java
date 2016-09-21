package pl.grobacz.example.testowaaplikacja.szukaniepracy.model;

/**
 * Created by grobacz on 2016-09-20.
 */
public class JUnitTestObjectSzukaniePracy {
    private int mId;
    private String mName;
    private String mAddress;
    private boolean mRegistered;
    private Database mDb;

    public JUnitTestObjectSzukaniePracy(Database db) {
        mDb = db;
    }

    public JUnitTestObjectSzukaniePracy(int id) {
        mId = id;
    }

    public JUnitTestObjectSzukaniePracy(int id, String name, String address, boolean registered) {
        mId = id;
        mName = name;
        mAddress = address;
        mRegistered = registered;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = "bla_" + name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public boolean isRegistered() {
        return mRegistered;
    }

    public void setRegistered(boolean registered) {
        mRegistered = registered;
    }
}
