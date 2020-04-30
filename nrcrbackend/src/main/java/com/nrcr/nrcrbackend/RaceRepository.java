package com.nrcr.nrcrbackend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.List;

public interface RaceRepository extends MongoRepository<Races, String> {
    Races findBy_id(ObjectId _id);
//    List<Races> findByDriverName(String driverName);
//    List<Races> findByRaceDate(LocalDate raceDate);
//    List<Races> findBySeason(String season);
//    List<Races> findByRaceDateBetween(LocalDate startDate, LocalDate endDate);
}