package core.utils;

public enum ApiEndPoints {


    MENU("/v4/menus"),
    POSTREQUEST("/api/users"),
    PUTREQUEST("/api/users/"),
    PUTTEST("/api/users/{id}")
    ;

    String path;

    ApiEndPoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
