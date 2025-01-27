package com.codeclan.tagsproject.TagsProject.Repositories.LocationRepositories;

import com.codeclan.tagsproject.TagsProject.Enums.StyleType;
import com.codeclan.tagsproject.TagsProject.models.Art;
import com.codeclan.tagsproject.TagsProject.models.Location;

import java.util.List;

public interface LocationRepositoryCustom {
    List<Location> getAllArtWithinDistance(double latitude, double longitude, int distance);

    List<Location> getAllArtOfACertainStyle(String style, List<Location> locationsInArea);

    List<Location> getAllArtByStyleWithinDistance(double latitude, double longitude, int distance, String style);
}
