package org.entity;
// Generated May 8, 2019 11:07:01 AM by Hibernate Tools 5.3.6.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name="COUNTRIES"
)
public class Country  implements java.io.Serializable {


     private String countryId;
     private Region region;
     private String countryName;
     private Set<Location> locations = new HashSet<Location>(0);

    public Country() {
    }

	
    public Country(String countryId) {
        this.countryId = countryId;
    }
    public Country(String countryId, Region region, String countryName, Set<Location> locations) {
       this.countryId = countryId;
       this.region = region;
       this.countryName = countryName;
       this.locations = locations;
    }
   
     @Id 

    
    @Column(name="COUNTRY_ID", unique=true, nullable=false, length=2)
    public String getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REGION_ID")
    public Region getRegion() {
        return this.region;
    }
    
    public void setRegion(Region region) {
        this.region = region;
    }

    
    @Column(name="COUNTRY_NAME", length=40)
    public String getCountryName() {
        return this.countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="country")
    public Set<Location> getLocations() {
        return this.locations;
    }
    
    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }




}


