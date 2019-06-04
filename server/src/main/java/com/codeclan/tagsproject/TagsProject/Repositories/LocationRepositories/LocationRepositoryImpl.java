package com.codeclan.tagsproject.TagsProject.Repositories.LocationRepositories;

import com.codeclan.tagsproject.TagsProject.models.Art;
import com.codeclan.tagsproject.TagsProject.models.CalculateDistance;
import com.codeclan.tagsproject.TagsProject.models.Location;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class LocationRepositoryImpl implements LocationRepositoryCustom{

    @Autowired
    CalculateDistance calculateDistance;

    @Autowired
    EntityManager entityManager;

    @Autowired
    LocationRepository locationRepository;

    public List<Location> getAllArtWithinDistance(double latitude, double longitude, int distance) {
       List<Location> result = null;
       Session session = entityManager.unwrap(Session.class);
       try {
          result = calculateDistance.calculateDistance(latitude, longitude, distance);

       } catch (HibernateException ex){
           ex.printStackTrace();
       } finally {
           session.close();
       }
       return result;
    }
}
