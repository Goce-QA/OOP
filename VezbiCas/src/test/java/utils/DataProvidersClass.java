package utils;

import org.apache.commons.exec.util.StringUtils;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.sql.Array;
import java.util.List;

public class DataProvidersClass {

    @DataProvider(name = "login")

    public Object[][] readFromString() {
        String username = "standard_user;" +
                "locked_out_user;" +
                "problem_user;" +
                "performance_glitch_user;" +
                "error_user;" +
                "visual_user;";

        String password = "secret_sauce";


        String[] res = StringUtils.split(username, ";");

        int count = res.length , i = 0;


        Object[][] username1 = new Object[count][2];


        for (String s : res) {
            username1[i][0] = s;
            username1[i][1] = password;
            i++;
        }
        return username1;




    }

    @DataProvider
    public Object[][] readFromTextFile() throws IOException {
        Object[][] loginData;
        // Patekata do text fajlot shto go imame kreirano
        File textFile = new File("C:\\repositories\\Java_G3\\TestData.txt");
        List<String> list;
        int dataRows, i = 0;
        list = Files.readAllLines(textFile.toPath(), Charset.defaultCharset());

        dataRows = list.size();

        loginData = new Object[dataRows][2];

        for(String line : list){
            String[] res = line.split(";");
            loginData[i][0] = res[0];
            loginData[i][1] = res[1];
            i++;
        }

        return loginData;
    }
}
