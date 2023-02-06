package Groups;

import Enums.Channels;
import org.json.simple.JSONObject;

public class BranchGroup {
    private int branchId;
    private Channels channel;
    private boolean overseas;

    public BranchGroup(int branchId, Channels channel, boolean overseas) {
        this.branchId = branchId;
        this.channel = channel;
        this.overseas = overseas;
    }

    public String toString() {
        JSONObject json = new JSONObject();
        json.put("branch_id",this.branchId);
        json.put("channel",this.channel.get());
        json.put("overseas",this.overseas);

        return json.toJSONString();
    }
}
