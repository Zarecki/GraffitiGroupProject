package com.codeclan.tagsproject.TagsProject.Components;

import com.codeclan.tagsproject.TagsProject.Enums.StyleType;
import com.codeclan.tagsproject.TagsProject.Repositories.ArtRepositories.ArtRepository;
import com.codeclan.tagsproject.TagsProject.Repositories.ArtistRepositories.ArtistRepository;
import com.codeclan.tagsproject.TagsProject.Repositories.ImageRepository.ImageRepo;
import com.codeclan.tagsproject.TagsProject.Repositories.LocationRepositories.LocationRepository;
import com.codeclan.tagsproject.TagsProject.models.Art;
import com.codeclan.tagsproject.TagsProject.models.Artist;
import com.codeclan.tagsproject.TagsProject.models.Image;
import com.codeclan.tagsproject.TagsProject.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArtRepository artRepository;

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    ImageRepo imageRepo;

    public DataLoader (){

    }

    public void run(ApplicationArguments args){

        Location Edinburgh = new Location(55.95206, -3.19648);
        Location CablsWyndHouse = new Location (55.974854, -3.171799);
        Location QueenCharlotteStreet = new Location (55.973965, -3.167765);
        Location CommercialQuay = new Location (55.976847, -3.174375);
        Location PortlandStreet = new Location (55.977207, -3.182916);
        Location Newhaven = new Location (55.978576, -3.193517);
        Location TrinityPath = new Location (55.978048, -3.205189);
        Location BalfourStreet = new Location (55.965848, -3.176221);
        Location AllanfieldPlace = new Location (55.960828, -3.173560);
        Location CaltonHill = new Location (55.954773, -3.182787);
        Location PalaceOfHolyRood = new Location (55.952658, -3.172658);
        Location Pleasance = new Location (55.945690, -3.188172);
        Location CodeClan = new Location (55.946976, -3.201626);
        Location EriksWithAk = new Location (55.944458, -3.221035);
        Location Viewforth = new Location (55.940745, -3.213687);
        Location MarchmontStreet = new Location (55.938683, -3.200833);
        Location TheCommie = new Location (55.939649, -3.173429);


        Location Glasgow = new Location(55.86515, -4.25763);
        Location KewTerrace = new Location (55.878907, -4.293399);
        Location HetheringtonBuilding = new Location (55.874661, -4.289004);
        Location SouthparkAve = new Location (55.872217, -4.287116);
        Location Woodlands = new Location (55.870483, -4.276452);
        Location ParkTerrace = new Location (55.869388, -4.281451);
        Location RenfrewStreet = new Location (55.866221, -4.263298);
        Location DalhousieLane = new Location (55.867317, -4.262504);
        Location WestGeorgeStreet = new Location (55.862874, -4.260616);
        Location YorkStreet = new Location (55.856696, -4.262268);
        Location CochraneStreet = new Location (55.860298, -4.246360);
        Location JosephBlackBuilding = new Location (55.872708, -4.294077);
        Location SandyfordStreet = new Location (55.864826, -4.295380);
        Location MontagueStreet = new Location (55.873164, -4.277652);


        Location Dundee = new Location(56.46913, -2.97489);
        Location OldCollege = new Location (56.463244, -2.973788);
        Location CourierPlace = new Location (56.462466, -2.973326);
        Location CastleStreet = new Location (56.460633, -2.968415);
        Location GellatlyStreet = new Location (56.462259, -2.966428);
        Location BreweryLane = new Location (56.463108, -2.986785);
        Location MagdelanYard = new Location (56.453662, -2.995427);

        Location FrederickStreet = new Location (57.150337, -2.092373);
        Location MearnsComplex = new Location (57.147365, -2.089447);
        Location BonAccord = new Location (57.143257, -2.105640);
        Location AlburyRoad = new Location (57.139439, -2.107412);
        Location PolmuirRoad = new Location (57.135315, -2.104056);
        Location Beechgrove = new Location (57.148026, -2.129388);
        Location TheChanonry = new Location (57.169304, -2.102464);


        Artist brutha = new Artist("Brutha", "../seedimages/signatures/signatureBrutha.jpg", "Quick scribbles and mad scrawls");
        Artist future = new Artist("Future", "../seedimages/signatures/SignatureFuture.jpg", "Your art will set you free");
        Artist goner = new Artist("Goner", "../seedimages/signatures/signatureGoner.jpg", "Born a goner");
        Artist gosh = new Artist("Gosh", "../seedimages/signatures/signatureGosh.jpg", "Slaps'n'Pastes");
        Artist mother = new Artist("Mother", "../seedimages/signatures/signatureMother.jpg", "Braaap");
        Artist unknown = new Artist("Unknown", "../seedimages/signatures/signatureUnknown.jpg", "Artist Unknown");

        LocalDate date01 = LocalDate.of(2018, 12, 1);
        LocalDate date02 = LocalDate.of(2018, 11, 2);
        LocalDate date03 = LocalDate.of(2019, 10, 3);
        LocalDate date04 = LocalDate.of(2019, 9, 4);
        LocalDate date05 = LocalDate.of(2017, 8, 5);
        LocalDate date06 = LocalDate.of(2018, 7, 6);
        LocalDate date07 = LocalDate.of(2018, 6, 7);
        LocalDate date08 = LocalDate.of(2019, 5, 8);
        LocalDate date09 = LocalDate.of(2017, 4, 9);
        LocalDate date10 = LocalDate.of(2019, 3, 10);
        LocalDate date11 = LocalDate.of(2019, 6, 10);
        LocalDate date12 = LocalDate.of(2018, 2, 11);
        LocalDate date13 = LocalDate.of(2016, 1, 12);
        LocalDate date14 = LocalDate.of(2019, 2, 13);
        LocalDate date15 = LocalDate.of(2019, 3, 14);
        LocalDate date16 = LocalDate.of(2019, 4, 15);
        LocalDate date17 = LocalDate.of(2018, 5, 16);
        LocalDate date18= LocalDate.of(2018, 6, 17);
        LocalDate date19 = LocalDate.of(2017, 7, 18);
        LocalDate date20 = LocalDate.of(2019, 8, 19);
        LocalDate date21 = LocalDate.of(2017, 9, 20);
        LocalDate date22 = LocalDate.of(2017, 10, 21);
        LocalDate date23 = LocalDate.of(2018, 11, 22);
        LocalDate date24 = LocalDate.of(2017, 12, 23);
        LocalDate date25 = LocalDate.of(2017, 1, 24);
        LocalDate date26 = LocalDate.of(2019, 11, 25);
        LocalDate date27 = LocalDate.of(2016, 10, 26);
        LocalDate date28 = LocalDate.of(2018, 9, 27);
        LocalDate date29 = LocalDate.of(2016, 8, 28);
        LocalDate date30 = LocalDate.of(2019, 7, 29);
        LocalDate date31 = LocalDate.of(2019, 6, 30);
        LocalDate date32 = LocalDate.of(2017, 5, 1);
        LocalDate date33 = LocalDate.of(2018, 4, 2);
        LocalDate date34 = LocalDate.of(2019, 3, 3);
        LocalDate date35 = LocalDate.of(2017, 2, 4);
        LocalDate date36 = LocalDate.of(2019, 12, 5);
        LocalDate date37 = LocalDate.of(2018, 1, 6);
        LocalDate date38 = LocalDate.of(2018, 11, 7);
        LocalDate date39 = LocalDate.of(2019, 2, 8);
        LocalDate date40 = LocalDate.of(2019, 10, 9);
        LocalDate date41 = LocalDate.of(2019, 3, 10);
        LocalDate date42 = LocalDate.of(2017, 9, 11);
        LocalDate date43 = LocalDate.of(2018, 4, 12);
        LocalDate date44 = LocalDate.of(2019, 8, 13);
        LocalDate date45 = LocalDate.of(2019, 5, 14);
        LocalDate date46 = LocalDate.of(2016, 7, 15);

        Art piece01 = new Art(goner, StyleType.THROWUP, "Rough AF", date01);
        Art piece02 = new Art(gosh, StyleType.STENCIL, "Always unaccountable", date03);
        Art piece03 = new Art(unknown, StyleType.PASTEUP, "Dog days", date02);
        Art piece04 = new Art(future, StyleType.PASTEUP, "Padre Morti", date04);
        Art piece05 = new Art(mother, StyleType.PIECE, "Did ye, aye?", date05);
        Art piece06 = new Art(future, StyleType.PIECE, "Dead of night", date06);
        Art piece07 = new Art(mother, StyleType.PIECE, "Evolution", date07);
        Art piece08 = new Art(unknown, StyleType.PIECE, "Taxi!", date08);
        Art piece09 = new Art(mother, StyleType.PIECE, "It's the little things", date09);
        Art piece10 = new Art(gosh, StyleType.PIECE, "Black'N'White", date10);
        Art piece11 = new Art(goner, StyleType.STENCIL, "Little by little", date12);
        Art piece12 = new Art(goner, StyleType.PASTEUP, "I'm feelin' it now, man", date13);
        Art piece13 = new Art(future, StyleType.PIECE, "Studios", date14);
        Art piece14 = new Art(mother, StyleType.PIECE, "Hae a drink", date15);
        Art piece15 = new Art(mother, StyleType.PIECE, "You whit?", date16);
        Art piece16 = new Art(mother, StyleType.PIECE, "Who's this guy?", date17);
        Art piece17 = new Art(unknown, StyleType.PIECE, "Why eye man", date18);
        Art piece18 = new Art(gosh, StyleType.PIECE, "Laundreta", date19);
        Art piece19 = new Art(mother, StyleType.PIECE, "roar", date20);
        Art piece20 = new Art(future, StyleType.PIECE, "Reflecting Light", date21);
        Art piece21 = new Art(brutha, StyleType.TAG, "I need somebody!", date22);
        Art piece22 = new Art(mother, StyleType.PASTEUP, "Scream with me", date23);
        Art piece23 = new Art(mother, StyleType.PASTEUP, "Grin N bear it", date24);
        Art piece24 = new Art(unknown, StyleType.STENCIL, "Politicado", date25);
        Art piece25 = new Art(unknown, StyleType.STENCIL, "Rise", date26);
        Art piece26 = new Art(gosh, StyleType.PIECE, "PandaBruh", date27);
        Art piece27 = new Art(gosh, StyleType.TAG, "No More", date28);
        Art piece28 = new Art(mother, StyleType.PIECE, "Aye ur ye?", date29);
        Art piece29 = new Art(gosh, StyleType.PASTEUP, "Comrade", date30);
        Art piece30 = new Art(unknown, StyleType.STENCIL, "Dinny let go!", date31);
        Art piece31 = new Art(unknown, StyleType.TAG, "Take my breath", date32);
        Art piece32 = new Art(brutha, StyleType.TAG, "Bog graff", date33);
        Art piece33 = new Art(brutha, StyleType.TAG, "Is nowhere safe?", date34);
        Art piece34 = new Art(unknown, StyleType.TAG, "Drunk in love", date35);
        Art piece35 = new Art(brutha, StyleType.PIECE, "Come into my parlour", date36);
        Art piece36 = new Art(unknown, StyleType.STENCIL, "Best use for it, really", date37);
        Art piece37 = new Art(unknown, StyleType.STENCIL, "nuclear", date38);
        Art piece38 = new Art(unknown, StyleType.PASTEUP, "Be the queen", date39);
        Art piece39 = new Art(unknown, StyleType.PIECE, "Scratched out", date40);
        Art piece40 = new Art(brutha, StyleType.TAG, "Life advice", date41);
        Art piece41 = new Art(goner, StyleType.PASTEUP, "The Venus of Milne's Court", date42);
        Art piece42 = new Art(unknown, StyleType.TAG, "God is a fancy bitch", date43);
        Art piece43 = new Art(mother, StyleType.PIECE, "Coverup", date44);
        Art piece44 = new Art(unknown, StyleType.TAG, "Passionate Souls", date45);
        Art piece45 = new Art(future, StyleType.THROWUP, "L'amour", date46);

        Image image01 = new Image(piece01, "../seedimages/");
        Image image02 = new Image(piece02, "../seedimages/");
        Image image03 = new Image(piece03, "../seedimages/");
        Image image04 = new Image(piece04, "../seedimages/");
        Image image05 = new Image(piece05, "../seedimages/");
        Image image06 = new Image(piece06, "../seedimages/");
        Image image07 = new Image(piece07, "../seedimages/");
        Image image08 = new Image(piece08, "../seedimages/");
        Image image09 = new Image(piece09, "../seedimages/");
        Image image10 = new Image(piece10, "../seedimages/");
        Image image11 = new Image(piece11, "../seedimages/");
        Image image12 = new Image(piece12, "../seedimages/");
        Image image13 = new Image(piece13, "../seedimages/");
        Image image14 = new Image(piece14, "../seedimages/");
        Image image15 = new Image(piece15, "../seedimages/");
        Image image16 = new Image(piece16, "../seedimages/");
        Image image17 = new Image(piece17, "../seedimages/");
        Image image18 = new Image(piece18, "../seedimages/");
        Image image19 = new Image(piece19, "../seedimages/");
        Image image20 = new Image(piece20, "../seedimages/");
        Image image21 = new Image(piece21, "../seedimages/");
        Image image22 = new Image(piece22, "../seedimages/");
        Image image23 = new Image(piece23, "../seedimages/");
        Image image24 = new Image(piece24, "../seedimages/");
        Image image25 = new Image(piece25, "../seedimages/");
        Image image26 = new Image(piece26, "../seedimages/");
        Image image27 = new Image(piece27, "../seedimages/");
        Image image28 = new Image(piece28, "../seedimages/");
        Image image29 = new Image(piece29, "../seedimages/");
        Image image30 = new Image(piece30, "../seedimages/");
        Image image31 = new Image(piece31, "../seedimages/");
        Image image32 = new Image(piece32, "../seedimages/");
        Image image33 = new Image(piece33, "../seedimages/");
        Image image34 = new Image(piece34, "../seedimages/");
        Image image35 = new Image(piece35, "../seedimages/");
        Image image36 = new Image(piece36, "../seedimages/");
        Image image37 = new Image(piece37, "../seedimages/");
        Image image38 = new Image(piece38, "../seedimages/");
        Image image39 = new Image(piece39, "../seedimages/");
        Image image40 = new Image(piece40, "../seedimages/");
        Image image41 = new Image(piece41, "../seedimages/");
        Image image42 = new Image(piece42, "../seedimages/");
        Image image43 = new Image(piece43, "../seedimages/");
        Image image44 = new Image(piece44, "../seedimages/");
        Image image45 = new Image(piece45, "../seedimages/");

        CablsWyndHouse.setStringLocation("CablsWyndHouse");
        QueenCharlotteStreet.setStringLocation("QueenCharlotteStreet");
        Edinburgh.setStringLocation("Edinburgh");
        CommercialQuay.setStringLocation("CommercialQuay");
        PortlandStreet.setStringLocation("PortlandStreet");
        Newhaven.setStringLocation("Newhaven");
        TrinityPath.setStringLocation("TrinityPath");
        BalfourStreet.setStringLocation("BalfourStreet");
        AllanfieldPlace.setStringLocation("AllanfieldPlace");
        CaltonHill.setStringLocation("CaltonHill");
        PalaceOfHolyRood.setStringLocation("PalaceOfHolyRood");
        Pleasance.setStringLocation("Pleasance");
        CodeClan.setStringLocation("CodeClan");
        EriksWithAk.setStringLocation("EriksWithAk");
        Viewforth.setStringLocation("Viewforth");
        MarchmontStreet.setStringLocation("MarchmontStreet");
        TheCommie.setStringLocation("TheCommie");
        Glasgow.setStringLocation("Glasgow");
        KewTerrace.setStringLocation("KewTerrace");
        HetheringtonBuilding.setStringLocation("HetheringtonBuilding");
        SouthparkAve.setStringLocation("SouthparkAve");
        Woodlands.setStringLocation("Woodlands");
        ParkTerrace.setStringLocation("ParkTerrace");
        RenfrewStreet.setStringLocation("RenfrewStreet");
        DalhousieLane.setStringLocation("DalhousieLane");
        WestGeorgeStreet.setStringLocation("WestGeorgeStreet");
        YorkStreet.setStringLocation("YorkStreet");
        CochraneStreet.setStringLocation("CochraneStreet");
        JosephBlackBuilding.setStringLocation("JosephBlackBuilding");
        SandyfordStreet.setStringLocation("SandyfordStreet");
        MontagueStreet.setStringLocation("MontagueStreet");
        Dundee.setStringLocation("Dundee ");
        OldCollege.setStringLocation("OldCollege");
        CourierPlace.setStringLocation("CourierPlace");
        CastleStreet.setStringLocation("CastleStreet");
        GellatlyStreet.setStringLocation("GellatlyStreet");
        BreweryLane.setStringLocation("BreweryLane");
        MagdelanYard.setStringLocation("MagdelanYard");
        FrederickStreet.setStringLocation("FrederickStreet");
        MearnsComplex.setStringLocation("MearnsComplex");
        BonAccord.setStringLocation("BonAccord");
        AlburyRoad.setStringLocation("AlburyRoad");
        PolmuirRoad.setStringLocation("PolmuirRoad");
        Beechgrove.setStringLocation("Beechgrove");
        TheChanonry.setStringLocation("TheChanonry");


        locationRepository.save(CablsWyndHouse);
        locationRepository.save(QueenCharlotteStreet);
        locationRepository.save(Edinburgh);
        locationRepository.save(CommercialQuay);
        locationRepository.save(PortlandStreet);
        locationRepository.save(Newhaven);
        locationRepository.save(TrinityPath);
        locationRepository.save(BalfourStreet);
        locationRepository.save(AllanfieldPlace);
        locationRepository.save(CaltonHill);
        locationRepository.save(PalaceOfHolyRood);
        locationRepository.save(Pleasance);
        locationRepository.save(CodeClan);
        locationRepository.save(EriksWithAk);
        locationRepository.save(Viewforth);
        locationRepository.save(MarchmontStreet);
        locationRepository.save(TheCommie);
        locationRepository.save(Glasgow);
        locationRepository.save(KewTerrace);
        locationRepository.save(HetheringtonBuilding);
        locationRepository.save(SouthparkAve);
        locationRepository.save(Woodlands);
        locationRepository.save(ParkTerrace);
        locationRepository.save(RenfrewStreet);
        locationRepository.save(DalhousieLane);
        locationRepository.save(WestGeorgeStreet);
        locationRepository.save(YorkStreet);
        locationRepository.save(CochraneStreet);
        locationRepository.save(JosephBlackBuilding);
        locationRepository.save(SandyfordStreet);
        locationRepository.save(MontagueStreet);
        locationRepository.save(Dundee);
        locationRepository.save(OldCollege);
        locationRepository.save(CourierPlace);
        locationRepository.save(CastleStreet);
        locationRepository.save(GellatlyStreet);
        locationRepository.save(BreweryLane);
        locationRepository.save(MagdelanYard);
        locationRepository.save(FrederickStreet);
        locationRepository.save(MearnsComplex);
        locationRepository.save(BonAccord);
        locationRepository.save(AlburyRoad);
        locationRepository.save(PolmuirRoad);
        locationRepository.save(Beechgrove);
        locationRepository.save(TheChanonry);


        imageRepo.save(image01);
        imageRepo.save(image02);
        imageRepo.save(image03);
        imageRepo.save(image04);
        imageRepo.save(image05);
        imageRepo.save(image06);
        imageRepo.save(image07);
        imageRepo.save(image08);
        imageRepo.save(image09);
        imageRepo.save(image10);
        imageRepo.save(image11);
        imageRepo.save(image12);
        imageRepo.save(image13);
        imageRepo.save(image14);
        imageRepo.save(image15);
        imageRepo.save(image16);
        imageRepo.save(image17);
        imageRepo.save(image18);
        imageRepo.save(image19);
        imageRepo.save(image20);
        imageRepo.save(image21);
        imageRepo.save(image22);
        imageRepo.save(image23);
        imageRepo.save(image24);
        imageRepo.save(image25);
        imageRepo.save(image26);
        imageRepo.save(image27);
        imageRepo.save(image28);
        imageRepo.save(image29);
        imageRepo.save(image30);
        imageRepo.save(image31);
        imageRepo.save(image32);
        imageRepo.save(image33);
        imageRepo.save(image34);
        imageRepo.save(image35);
        imageRepo.save(image36);
        imageRepo.save(image37);
        imageRepo.save(image38);
        imageRepo.save(image39);
        imageRepo.save(image40);
        imageRepo.save(image41);
        imageRepo.save(image42);
        imageRepo.save(image43);
        imageRepo.save(image44);
        imageRepo.save(image45);

        piece01.getImages().add(image01);
        piece02.getImages().add(image02);
        piece03.getImages().add(image03);
        piece04.getImages().add(image04);
        piece05.getImages().add(image05);
        piece06.getImages().add(image06);
        piece07.getImages().add(image07);
        piece08.getImages().add(image08);
        piece09.getImages().add(image09);
        piece10.getImages().add(image10);
        piece11.getImages().add(image11);
        piece12.getImages().add(image12);
        piece13.getImages().add(image13);
        piece14.getImages().add(image14);
        piece15.getImages().add(image15);
        piece16.getImages().add(image16);
        piece17.getImages().add(image17);
        piece18.getImages().add(image18);
        piece19.getImages().add(image19);
        piece20.getImages().add(image20);
        piece21.getImages().add(image21);
        piece22.getImages().add(image22);
        piece23.getImages().add(image23);
        piece24.getImages().add(image24);
        piece25.getImages().add(image25);
        piece26.getImages().add(image26);
        piece27.getImages().add(image27);
        piece28.getImages().add(image28);
        piece29.getImages().add(image29);
        piece30.getImages().add(image30);
        piece31.getImages().add(image31);
        piece32.getImages().add(image32);
        piece33.getImages().add(image33);
        piece34.getImages().add(image34);
        piece35.getImages().add(image35);
        piece36.getImages().add(image36);
        piece37.getImages().add(image37);
        piece38.getImages().add(image38);
        piece39.getImages().add(image39);
        piece40.getImages().add(image40);
        piece41.getImages().add(image41);
        piece42.getImages().add(image42);
        piece43.getImages().add(image43);
        piece44.getImages().add(image44);
        piece45.getImages().add(image45);

        piece01.setLocation(CablsWyndHouse);
        piece02.setLocation(QueenCharlotteStreet);
        piece03.setLocation(Edinburgh);
        piece04.setLocation(CommercialQuay);
        piece05.setLocation(PortlandStreet);
        piece06.setLocation(Newhaven);
        piece07.setLocation(TrinityPath);
        piece08.setLocation(BalfourStreet);
        piece09.setLocation(AllanfieldPlace);
        piece10.setLocation(CaltonHill);
        piece11.setLocation(PalaceOfHolyRood);
        piece12.setLocation(Pleasance);
        piece13.setLocation(CodeClan);
        piece14.setLocation(EriksWithAk);
        piece15.setLocation(Viewforth);
        piece16.setLocation(MarchmontStreet);
        piece17.setLocation(TheCommie);
        piece18.setLocation(Glasgow);
        piece19.setLocation(KewTerrace);
        piece20.setLocation(HetheringtonBuilding);
        piece21.setLocation(SouthparkAve);
        piece22.setLocation(Woodlands);
        piece23.setLocation(ParkTerrace);
        piece24.setLocation(RenfrewStreet);
        piece25.setLocation(DalhousieLane);
        piece26.setLocation(WestGeorgeStreet);
        piece27.setLocation(YorkStreet);
        piece28.setLocation(CochraneStreet);
        piece29.setLocation(JosephBlackBuilding);
        piece30.setLocation(SandyfordStreet);
        piece31.setLocation(MontagueStreet);
        piece32.setLocation(Dundee);
        piece33.setLocation(OldCollege);
        piece34.setLocation(CourierPlace);
        piece35.setLocation(CastleStreet);
        piece36.setLocation(GellatlyStreet);
        piece37.setLocation(BreweryLane);
        piece38.setLocation(MagdelanYard);
        piece39.setLocation(FrederickStreet);
        piece40.setLocation(MearnsComplex);
        piece41.setLocation(BonAccord);
        piece42.setLocation(AlburyRoad);
        piece43.setLocation(PolmuirRoad);
        piece44.setLocation(Beechgrove);
        piece45.setLocation(TheChanonry);

        artRepository.save(piece01);
        artRepository.save(piece02);
        artRepository.save(piece03);
        artRepository.save(piece04);
        artRepository.save(piece05);
        artRepository.save(piece06);
        artRepository.save(piece07);
        artRepository.save(piece08);
        artRepository.save(piece09);
        artRepository.save(piece10);
        artRepository.save(piece11);
        artRepository.save(piece12);
        artRepository.save(piece13);
        artRepository.save(piece14);
        artRepository.save(piece15);
        artRepository.save(piece16);
        artRepository.save(piece17);
        artRepository.save(piece18);
        artRepository.save(piece19);
        artRepository.save(piece20);
        artRepository.save(piece21);
        artRepository.save(piece22);
        artRepository.save(piece23);
        artRepository.save(piece24);
        artRepository.save(piece25);
        artRepository.save(piece26);
        artRepository.save(piece27);
        artRepository.save(piece28);
        artRepository.save(piece29);
        artRepository.save(piece30);
        artRepository.save(piece31);
        artRepository.save(piece32);
        artRepository.save(piece33);
        artRepository.save(piece34);
        artRepository.save(piece35);
        artRepository.save(piece36);
        artRepository.save(piece37);
        artRepository.save(piece38);
        artRepository.save(piece39);
        artRepository.save(piece40);
        artRepository.save(piece41);
        artRepository.save(piece42);
        artRepository.save(piece43);
        artRepository.save(piece45);

        goner.getArt().add(piece01);
        gosh.getArt().add(piece02);
        unknown.getArt().add(piece03);
        future.getArt().add(piece04);
        mother.getArt().add(piece05);
        future.getArt().add(piece06);
        mother.getArt().add(piece07);
        unknown.getArt().add(piece08);
        mother.getArt().add(piece09);
        gosh.getArt().add(piece10);
        goner.getArt().add(piece11);
        goner.getArt().add(piece12);
        future.getArt().add(piece13);
        mother.getArt().add(piece14);
        mother.getArt().add(piece15);
        mother.getArt().add(piece16);
        unknown.getArt().add(piece17);
        gosh.getArt().add(piece18);
        mother.getArt().add(piece19);
        future.getArt().add(piece20);
        brutha.getArt().add(piece21);
        mother.getArt().add(piece22);
        mother.getArt().add(piece23);
        unknown.getArt().add(piece24);
        unknown.getArt().add(piece25);
        gosh.getArt().add(piece26);
        gosh.getArt().add(piece27);
        mother.getArt().add(piece28);
        gosh.getArt().add(piece29);
        unknown.getArt().add(piece30);
        unknown.getArt().add(piece31);
        brutha.getArt().add(piece32);
        brutha.getArt().add(piece33);
        unknown.getArt().add(piece34);
        brutha.getArt().add(piece35);
        unknown.getArt().add(piece36);
        unknown.getArt().add(piece37);
        unknown.getArt().add(piece38);
        unknown.getArt().add(piece39);
        brutha.getArt().add(piece40);
        goner.getArt().add(piece41);
        unknown.getArt().add(piece42);
        mother.getArt().add(piece43);
        unknown.getArt().add(piece44);
        future.getArt().add(piece45);

        artistRepository.save(brutha);
        artistRepository.save(future);
        artistRepository.save(goner);
        artistRepository.save(gosh);
        artistRepository.save(mother);
        artistRepository.save(unknown);
    }


}
