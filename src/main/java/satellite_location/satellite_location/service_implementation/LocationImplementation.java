package satellite_location.satellite_location.service_implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import satellite_location.satellite_location.model.Location;
import satellite_location.satellite_location.repository.LocationRepository;
import satellite_location.satellite_location.service_interface.LocationInterface;

import java.util.List;

@Service
public class LocationImplementation implements LocationInterface {


    @Autowired
    private LocationRepository locationRepo;
    @Override
    public Location saveLocation(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        Location existingLocation = locationRepo.findById(location.getLocationId()).orElse(null);
        existingLocation.setSatelliteName(location.getSatelliteName());
        existingLocation.setElevationMask(location.getElevationMask());
        existingLocation.setISLbandwith(location.getISLbandwith());
        existingLocation.setLatitudeThreshold(location.getLatitudeThreshold());
        return locationRepo.save(existingLocation);
    }

    @Override
    public List<Location> findAllLocation() {
        // It returns a list so casting is needed
        return (List<Location>) locationRepo.findAll();
    }

    @Override
    public void deleteLocation(long id) {
        // To delete catalog
        locationRepo.deleteById(id);
    }
}
