package Groups;

public class PrincipalGroup {
    private String principalEmailAddress;
    private boolean autoEmailWhenLive;
    private boolean autoEmailUpdates;

    public void setPrincipalEmailAddress(String principalEmailAddress) {
        this.principalEmailAddress = principalEmailAddress;
    }

    public void setAutoEmailWhenLive(boolean autoEmailWhenLive) {
        this.autoEmailWhenLive = autoEmailWhenLive;
    }

    public void setAutoEmailUpdates(boolean autoEmailUpdates) {
        this.autoEmailUpdates = autoEmailUpdates;
    }
}
