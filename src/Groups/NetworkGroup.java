package Groups;

import org.json.simple.JSONObject;

import java.lang.reflect.Field;

public class NetworkGroup extends BaseGroup{
    protected int networkId;

    public NetworkGroup(int networkId) {
        this.networkId = networkId;
    }

    public Field[] getFields() {
        return this.getFields();
    }
}
