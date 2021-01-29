package satellite_location.satellite_location.model;

import javax.persistence.*;

@Entity
@Table(name = "spacelocation",catalog = "spacelocation")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long locationId;
    private String satelliteName;
    private long elevationMask;
    private long ISLbandwith;
    private long latitudeThreshold;

    public Location(){ super(); }

    public Location(long locationId, String satelliteName, long elevationMask,
                    long ISLbandwith, long latitudeThreshold) {
        this.locationId = locationId;
        this.satelliteName = satelliteName;
        this.elevationMask = elevationMask;
        this.ISLbandwith = ISLbandwith;
        this.latitudeThreshold = latitudeThreshold;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public long getElevationMask() {
        return elevationMask;
    }

    public void setElevationMask(long elevationMask) {
        this.elevationMask = elevationMask;
    }

    public long getISLbandwith() {
        return ISLbandwith;
    }

    public void setISLbandwith(long ISLbandwith) {
        this.ISLbandwith = ISLbandwith;
    }

    public long getLatitudeThreshold() {
        return latitudeThreshold;
    }

    public void setLatitudeThreshold(long latitudeThreshold) {
        this.latitudeThreshold = latitudeThreshold;
    }
}
