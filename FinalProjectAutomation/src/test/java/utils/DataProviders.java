package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider( name="newUserData")

    public Object[][] newUserData(){
        Object[][] newUserData = {
                {"Petko", "Petkoski", "petko.petkoski", "nemapassword"},
                {"Stanko", "Stankoski", "stankoski.stanko", "zostopasswrod"},
                {"Trajko", "Trajkoski", "trakoskiT", "kakovpassword"},
                {"Toshko", "Toseski", "toshko.t", "prazenpassword"},
                {"Pamela", "Jeferson", "pamjey", "takovpassword"}
        };
        return newUserData;
    }
}
