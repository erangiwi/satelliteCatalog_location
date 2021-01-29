package satellite_location.satellite_location.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import satellite_location.satellite_location.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location,Long> {
}
