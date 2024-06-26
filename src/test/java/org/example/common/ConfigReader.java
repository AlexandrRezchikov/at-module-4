package org.example.common;

import java.util.ResourceBundle;

public class ConfigReader {

    public static final ResourceBundle config = ResourceBundle.getBundle("config");

    public static String platformAndBrowser(){
        return config.getString("platform_and_browser");
    }

    public static boolean clearCookiesAndStorage(){
        return Boolean.parseBoolean(config.getString("clear_cookies_and_storage"));
    }

    public static boolean holdBrowserOpen() {
        return Boolean.parseBoolean(config.getString("hold_browser_open"));
    }
}
