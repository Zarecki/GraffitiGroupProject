package com.codeclan.tagsproject.TagsProject.Components;

import com.codeclan.tagsproject.TagsProject.Enums.StyleType;
import com.codeclan.tagsproject.TagsProject.Repositories.ArtRepositories.ArtRepository;
import com.codeclan.tagsproject.TagsProject.Repositories.ArtistRepositories.ArtistRepository;
import com.codeclan.tagsproject.TagsProject.Repositories.LocationRepositories.LocationRepository;
import com.codeclan.tagsproject.TagsProject.models.Art;
import com.codeclan.tagsproject.TagsProject.models.Artist;
import com.codeclan.tagsproject.TagsProject.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArtRepository artRepository;

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    LocationRepository locationRepository;

    public DataLoader (){

    }

    public void run(ApplicationArguments args){

        Location Edinburgh = new Location("55.9533N", "3.1883W");
        locationRepository.save(Edinburgh);

        Location Glasgow = new Location("55.8642N", "4.2518W");
        locationRepository.save(Glasgow);

        Location Dundee = new Location("56.4620N", "2.9707W");
        locationRepository.save(Dundee);

        Artist JimmyMcGee = new Artist("Wee Jim", "https://www.instagram.com/p/Bx9yf7pDs4M/", "He's wee, He's Jim.");

        Artist Banksy = new Artist("Banksy", "https://www.instagram.com/p/BwPyw1-gS0y/", "Mysterious. Probably a dick.");

        Artist Salvador = new Artist("Dali", "https://www.instagram.com/p/BuQtpMIALY9/", "Real straight shooter.");

        Art piece1 = new Art(JimmyMcGee, StyleType.PIECE, "Pure piece eh?", Edinburgh, new Date());

        Art piece2 = new Art(Banksy, StyleType.PASTEUP, "Hedgehog with Ennui", Glasgow, new Date());

        Art piece3 = new Art(Salvador, StyleType.STENCIL, "Paint Roller Girl", Dundee, new Date());


        JimmyMcGee.getArt().add(piece1);
        Banksy.getArt().add(piece2);
        Salvador.getArt().add(piece3);
        piece1.getImages().add("https://www.instagram.com/p/Bs8Xt7BgfLM/");
        piece2.getImages().add("https://www.instagram.com/p/Bsn6PN4gzfw/");
        piece3.getImages().add("https://www.instagram.com/p/BjJxuVtAZUm/");
        artRepository.save(piece3);
        artRepository.save(piece2);
        artRepository.save(piece1);
        artistRepository.save(Salvador);
        artistRepository.save(Banksy);
        artistRepository.save(JimmyMcGee);
    }


}
