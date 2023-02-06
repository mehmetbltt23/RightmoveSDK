package Groups;

import Enums.DimensionUnits;

public class RoomGroup {
    private String roomName;
    private String roomDescription;
    private String roomDimensionText;
    private String[] roomPhotoUrls;
    private DimensionUnits roomDimensionUnit;
    private float roomLength;
    private float roomWidth;

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setRoomDimensionText(String roomDimensionText) {
        this.roomDimensionText = roomDimensionText;
    }

    public void setRoomPhotoUrls(String[] roomPhotoUrls) {
        this.roomPhotoUrls = roomPhotoUrls;
    }

    public void setRoomDimensionUnit(DimensionUnits roomDimensionUnit) {
        this.roomDimensionUnit = roomDimensionUnit;
    }

    public void setRoomLength(float roomLength) {
        this.roomLength = roomLength;
    }

    public void setRoomWidth(float roomWidth) {
        this.roomWidth = roomWidth;
    }
}
