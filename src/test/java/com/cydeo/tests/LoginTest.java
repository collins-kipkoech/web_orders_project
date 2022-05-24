package com.cydeo.tests;

import com.cydeo.pages.Login;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLogin(){
        Login login = new Login();
        login.goTo();
        String username = ConfigReader.read("weborder_username");
        String password = ConfigReader.read("weborder_password");
        login.login(username,password);
    }
}
