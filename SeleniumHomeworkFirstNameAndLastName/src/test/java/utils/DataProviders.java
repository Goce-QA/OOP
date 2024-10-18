package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider (name ="userData")

    public Object[][] userData(){
        Object[][] userData = {
                {"Petko", "nemapassword"},
                {"Stanko", "zostopasswrod"},
                {"Trajko", "kakovpassword"},
                {"Toshko", "prazenpassword"},
                {"Pamela", "takovpassword"}
        };
        return userData;
    }

    @DataProvider ( name="newUserData")

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

