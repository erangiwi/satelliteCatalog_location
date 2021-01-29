package satellite_location.satellite_location.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import satellite_location.satellite_location.model.Location;
import satellite_location.satellite_location.service_implementation.LocationImplementation;

import java.util.List;

@RestController
// Postman is used to do operations
// Therefore need to add cross origin annotation
@CrossOrigin("*")
public class LocationController {

    // To create bean of implementation class
    @Autowired
    private LocationImplementation locationImplementation;

    // To call save method or to save new catalog
    @PostMapping(value = "saveLocation")
    public Location saveLocation(@RequestBody Location location){
        System.out.println("Location save works properly!");
        locationImplementation.saveLocation((location));
        return location;
    }

    // Find all catalog from db
    @GetMapping(value = "getAllLocation")
    public List<Location> findAllLocation(){
        return  locationImplementation.findAllLocation();
    }

    // Update catalog
    @PutMapping("updateLocation")
    public Location updateLocation(@RequestBody Location location){
        return locationImplementation.updateLocation(location);
    }

    // Delete catalog
    @DeleteMapping("deleteLocation")
    public String deleteLocation(@RequestParam long id){
        locationImplementation.deleteLocation(id);
        return "Location Deleted!";
    }

}
