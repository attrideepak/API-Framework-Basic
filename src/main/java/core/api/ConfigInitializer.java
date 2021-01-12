package core.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigInitializer {
    public static String activeEnv;
    public static Properties properties = new Properties();
    private static Logger logger = Logger.getLogger(ConfigInitializer.class);

    public static Properties defaultConfigProp =
            initializePropertiesFiles(
                    new File(System.getProperty("user.dir")) + "/src/main/resources/env.properties");

    public static Properties initializePropertiesFiles(String filePath) {
        Properties pr = new Properties();
        try {
            //logger.info("Loading properties from path : " + filePath);
            FileInputStream fis = new FileInputStream(filePath);
            pr.load(fis);
            //logger.info("Properties initialised");
        } catch (Exception e) {
            //logger.error("Unable to initialise property file!\n " + e.getStackTrace());
        }
        return pr;
    }

    private void loadEnvProperties() throws IOException {
        Properties env = new Properties();
        env.load(getClass().getResourceAsStream("/env.properties"));
        activeEnv = env.getProperty("env_to_use");

        System.out.println("Active env: "+activeEnv);

            properties =
                    initializePropertiesFiles(new File(System.getProperty("user.dir")).getAbsolutePath()
                    +"/configurations/environment/"
                    +activeEnv
                    +".properties");

        System.out.println(properties.toString());



            System.out.println("Properties loaded");
    }


    @BeforeSuite(alwaysRun = true)
    public void initialize() throws Exception {
        loadEnvProperties();
    }

}
