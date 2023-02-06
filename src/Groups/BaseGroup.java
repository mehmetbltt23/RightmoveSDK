package Groups;

import org.json.simple.JSONObject;

import java.lang.reflect.Field;

public class BaseGroup {
    public String toString() {
        try {
            //TODO reflect ile NetworkGroup.java clasındaki field'ları listeleyebilmem lazım sonra JSON datasına ekleyebilmem lazım.
            System.out.println(this.getClass().getMethod("getFields"));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        for (Field value:this.getClass().getFields()) {
            System.out.println(value.getName());
        }
        return "";
        /*JSONObject json = new JSONObject();
        json.put("network_id", this.networkId);

        return json.toJSONString();*/
    }
}
