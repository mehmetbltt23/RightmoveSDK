package Groups;

import Enums.LetTypes;
import Enums.PropertyTypes;
import Enums.Statuses;

import java.util.ArrayList;
import java.util.Date;

public class PropertyGroup {
    private int contractConths;
    private int minimumTerm;
    private boolean published;
    private boolean new_home;
    private boolean studentProperty;
    private boolean houseFlatShare;
    private String agentRef;
    private String createDate;
    private String updateDate;
    private String dateAvailable;
    private PropertyTypes propertyType;
    private Statuses status;
    private LetTypes letType;
    private AddressGroup address;
    private PriceGroup priceInformation;
    private PrincipalGroup principal;
    private DetailGroup details;
    private ArrayList<MediaGroup> media;

    public void setContractConths(int contractConths) {
        this.contractConths = contractConths;
    }

    public void setMinimumTerm(int minimumTerm) {
        this.minimumTerm = minimumTerm;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public void setNew_home(boolean new_home) {
        this.new_home = new_home;
    }

    public void setStudentProperty(boolean studentProperty) {
        this.studentProperty = studentProperty;
    }

    public void setHouseFlatShare(boolean houseFlatShare) {
        this.houseFlatShare = houseFlatShare;
    }

    public void setAgentRef(String agentRef) {
        this.agentRef = agentRef;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public void setPropertyType(PropertyTypes propertyType) {
        this.propertyType = propertyType;
    }

    public void setStatus(Statuses status) {
        this.status = status;
    }

    public void setLetType(LetTypes letType) {
        this.letType = letType;
    }

    public void setAddress(AddressGroup address) {
        this.address = address;
    }

    public void setPriceInformation(PriceGroup priceInformation) {
        this.priceInformation = priceInformation;
    }

    public void setPrincipal(PrincipalGroup principal) {
        this.principal = principal;
    }

    public void setDetails(DetailGroup details) {
        this.details = details;
    }

    public void setMedia(ArrayList<MediaGroup> media) {
        this.media = media;
    }
}
