package com.sagarstack.constants;

public final class AllHTTPMessages {

    // Prevent object creation
    private AllHTTPMessages() {
    }

    // ============================================================
    // COMMON APPLICATION MESSAGES
    // ============================================================

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";
    public static final String BLOCKED = "BLOCKED";
    public static final String REGISTERED = "REGISTERED";


    // ============================================================
    // 1xx - INFORMATIONAL
    // ============================================================

    public static final String INFORMATIONAL_100_CONTINUE = "100_CONTINUE";
    public static final String INFORMATIONAL_101_SWITCHING_PROTOCOLS =
            "101_SWITCHING_PROTOCOLS";


    public static final int SUCCESS_200_CODE = 200;
    public static final int NOT_FOUND_404_CODE =404;
    public static final int ACCEPTED_202_CODE = 202;
    
    // ============================================================
    // 2xx - SUCCESS
    // ============================================================

    public static final String SUCCESS_200_OK = "200_OK";

    public static final String SUCCESS_201_CREATED = "201_CREATED";

    public static final String SUCCESS_202_ACCEPTED = "202_ACCEPTED";

    public static final String SUCCESS_204_NO_CONTENT = "204_NO_CONTENT";


    // ============================================================
    // 3xx - REDIRECTION
    // ============================================================

    public static final String REDIRECTION_301_MOVED_PERMANENTLY =
            "301_MOVED_PERMANENTLY";

    public static final String REDIRECTION_302_FOUND =
            "302_FOUND";

    public static final String REDIRECTION_304_NOT_MODIFIED =
            "304_NOT_MODIFIED";


    // ============================================================
    // 4xx - CLIENT ERRORS
    // ============================================================

    public static final String CLIENT_ERROR_400_BAD_REQUEST =
            "400_BAD_REQUEST";

    public static final String CLIENT_ERROR_401_UNAUTHORIZED =
            "401_UNAUTHORIZED";

    public static final String CLIENT_ERROR_403_FORBIDDEN =
            "403_FORBIDDEN";

    public static final String CLIENT_ERROR_404_NOT_FOUND =
            "404_NOT_FOUND";

    public static final String CLIENT_ERROR_405_METHOD_NOT_ALLOWED =
            "405_METHOD_NOT_ALLOWED";

    public static final String CLIENT_ERROR_409_CONFLICT =
            "409_CONFLICT";


    // ============================================================
    // 5xx - SERVER ERRORS
    // ============================================================

    public static final String SERVER_ERROR_500_INTERNAL_SERVER_ERROR =
            "500_INTERNAL_SERVER_ERROR";

    public static final String SERVER_ERROR_502_BAD_GATEWAY =
            "502_BAD_GATEWAY";

    public static final String SERVER_ERROR_503_SERVICE_UNAVAILABLE =
            "503_SERVICE_UNAVAILABLE";

    public static final String SERVER_ERROR_504_GATEWAY_TIMEOUT =
            "504_GATEWAY_TIMEOUT";

}