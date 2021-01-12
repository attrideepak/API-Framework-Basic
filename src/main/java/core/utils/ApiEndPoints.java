package core.utils;

public enum ApiEndPoints {


    MENU("/v4/menus"),
    POSTREQUEST(EnvironmentEndPoint.reqres + "/api/users"),
    PUTREQUEST(EnvironmentEndPoint.reqres + "/api/users/"),
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
