package fr.devavance.stationvelibservice.repository;

import fr.devavance.stationvelibservice.beans.StationVelib;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationVelibRepository extends JpaRepository<StationVelib, Integer> {
}
