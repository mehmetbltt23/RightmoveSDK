package Request;

import Groups.BranchGroup;
import Groups.NetworkGroup;
import Groups.PropertyGroup;
import org.json.simple.JSONObject;

public class SendPropertyRequest {
    private NetworkGroup network;
    private BranchGroup branch;
    private PropertyGroup property;

    public void setNetwork(NetworkGroup network) {
        this.network = network;
    }

    public void setBranch(BranchGroup branch) {
        this.branch = branch;
    }

    public void setProperty(PropertyGroup property) {
        this.property = property;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("network", this.network);
        json.put("branch", this.branch);
        json.put("property", this.property);

        return json;
    }
}
