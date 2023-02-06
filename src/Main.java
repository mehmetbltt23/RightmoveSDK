import Groups.BranchGroup;
import Groups.NetworkGroup;
import Request.SendPropertyRequest;
import Enums.Channels;

public class Main {
    public static void main(String[] args) {
        RightmoveADF rightmove = new RightmoveADF();
        SendPropertyRequest adf = RightmoveADF.createRequest();

        adf.setNetwork(new NetworkGroup(1223));
        adf.setBranch(new BranchGroup(1, Channels.LETTINGS, false));

        rightmove.send(adf);

    }
}
