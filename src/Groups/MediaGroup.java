package Groups;

import Enums.MediaTypes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MediaGroup {
    private MediaTypes mediaType;
    private String mediaUrl;
    private String caption;
    private String mediaUpdateDate;
    private int sortOrder;

    public void setMediaType(MediaTypes mediaType) {
        this.mediaType = mediaType;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setMediaUpdateDate(LocalDateTime mediaUpdateDate) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy GG:mm:ss");
        this.mediaUpdateDate = mediaUpdateDate.format(myFormatObj);
    }
}
