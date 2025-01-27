import React, { Component } from 'react';
import AdvancedFilter from './AdvancedFilter';
import LocationFilter from './LocationFilter';
import { Link } from "react-router-dom";
import './Filter.css'

import mapKey from "../../keys.js";

class Filter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      stringLocation: "",
      distance: 0,
      style: "all"
    };
    this.handleSubmit = this.handleSubmit.bind(this);
    this.onStringLocation = this.onStringLocation.bind(this);
    this.onDistanceSelectChange = this.onDistanceSelectChange.bind(this);
    this.onStyleSelectChange = this.onStyleSelectChange.bind(this);
  }

  handleSubmit(evt) {
    evt.preventDefault();

    if (this.state.stringLocation !== "") {
      this.fetchMapCoordinates(this.state.stringLocation);
    } else {
      this.props.setDefaultLocation();
    }
    //Call API for search items
    this.props.handleSearchSubmit();
  }

  fetchMapCoordinates(stringLocation) {
    const urlStringLocation = stringLocation.replace(",", "%2C");
    const url = `https://www.mapquestapi.com/geocoding/v1/address?key=${mapKey}&inFormat=kvp&outFormat=json&location=${urlStringLocation}&thumbMaps=false`;
    const request = new XMLHttpRequest();
    request.open("GET", url);

    request.addEventListener("load", () => {
      if (request.status === 200) {
        const jsonData = request.responseText;
        const mapData = JSON.parse(jsonData);
        const filterData = this.scottishLocationFilter(mapData);
        if (filterData !== undefined) {
          this.props.setLocation({
            lat: filterData.latLng.lat,
            long: filterData.latLng.lng
          });
        } else {
          this.props.setDefaultLocation();
          this.props.locationNotFound();
        }
      }
    });
    request.send(null);
  }

  scottishLocationFilter(mapData) {
    const locationArray = mapData.results[0].locations;
    return locationArray.filter(location => location.adminArea1 === "GB")[0];
  }

  onStringLocation = inputLocation => {
    this.setState({ stringLocation: inputLocation });
  };

  onDistanceSelectChange = inputDistance => {
    this.props.setDistance(inputDistance);
  };

  onStyleSelectChange = inputStyle => {
    this.props.setStyle(inputStyle);
  };

  render() {
    return (
      <form className="filter-form" onSubmit={this.handleSubmit}>
        <div className="main-filter">
          <LocationFilter
            onStringLocation={this.onStringLocation}
            stringLocation={this.state.stringLocation}
            onDistanceSelectChange={this.onDistanceSelectChange}
            distance={this.state.distance}
            onStyleSelectChange={this.onStyleSelectChange}
          />
          <input className="submit" type="submit" value="Search" />
        </div>
        <AdvancedFilter onStyleSelectChange={this.onStyleSelectChange} />
      </form>
    );
  }
}

export default Filter;
