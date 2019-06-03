package com.codeclan.tagsproject.TagsProject.models;

import com.codeclan.tagsproject.TagsProject.Enums.StyleType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "arts")
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties("art")
    @OneToMany(mappedBy = "art", fetch = FetchType.LAZY)
    private List<Image> images;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="artist", nullable = false)
    Artist artist;

    @Column(name = "style")
    private StyleType style;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;


    public Art(Artist artist, StyleType style, String description) {
        this.images = new ArrayList<>();
        this.artist = artist;
        this.style = style;
        this.description = description;
        this.location = location;
    }

    public Art() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public StyleType getStyle() {
        return style;
    }

    public void setStyle(StyleType style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }


}