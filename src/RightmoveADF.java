import Request.SendPropertyRequest;

public class RightmoveADF {
    public static SendPropertyRequest createRequest() {
        return new SendPropertyRequest();
    }

    public void send(SendPropertyRequest request) {
        System.out.println(request.toJson());
    }
}
