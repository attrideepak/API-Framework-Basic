package core.api;

public enum TestEnvironment {

    DOMAIN(ConfigInitializer.properties.getProperty("DOMAIN"));

    final String value;

    TestEnvironment(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
