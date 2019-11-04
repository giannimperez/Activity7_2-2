package bikeproject;

public interface RoadParts {
    //constant declaration
    public final String TERRAIN = "track_racing";

    //required methods after implementation
    public String getTyreWidth();
    public void setTyreWidth(String newValue);
    public String getPostHeight();
    public void setPostHeight(String newValue);
}
