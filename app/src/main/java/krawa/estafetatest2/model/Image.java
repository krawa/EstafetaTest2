package krawa.estafetatest2.model;

import io.realm.RealmObject;

public class Image extends RealmObject {

    private String link;
    private String path;
    private String mime;
    private double lat;
    private double lon;
    private String dateTime;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Image image = (Image) o;

        return link != null ? link.equals(image.link) : image.link == null;

    }

    @Override
    public int hashCode() {
        return link != null ? link.hashCode() : 0;
    }
}
