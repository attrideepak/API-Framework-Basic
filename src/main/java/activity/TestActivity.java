package activity;

import org.apache.log4j.Logger;

import java.io.File;

public class TestActivity {
    static Logger logger = Logger.getLogger(TestActivity.class);
    public static void main(String[] args) {
        System.out.println(new File(System.getProperty("user.dir")).getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
    }
}
