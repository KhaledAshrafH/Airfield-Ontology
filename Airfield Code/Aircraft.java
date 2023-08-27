package Airfield;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;


public interface Aircraft extends Airport {

    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#AtPosition
     */
     
    /**
     * Gets all property values for the AtPosition property.<p>
     * 
     * @returns a collection of values for the AtPosition property.
     */
    Collection<? extends GroundSurface> getAtPosition();

    /**
     * Checks if the class has a AtPosition property value.<p>
     * 
     * @return true if there is a AtPosition property value.
     */
    boolean hasAtPosition();

    /**
     * Adds a AtPosition property value.<p>
     * 
     * @param newAtPosition the AtPosition property value to be added
     */
    void addAtPosition(GroundSurface newAtPosition);

    /**
     * Removes a AtPosition property value.<p>
     * 
     * @param oldAtPosition the AtPosition property value to be removed.
     */
    void removeAtPosition(GroundSurface oldAtPosition);


    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HasType
     */
     
    /**
     * Gets all property values for the HasType property.<p>
     * 
     * @returns a collection of values for the HasType property.
     */
    Collection<? extends AircraftType> getHasType();

    /**
     * Checks if the class has a HasType property value.<p>
     * 
     * @return true if there is a HasType property value.
     */
    boolean hasHasType();

    /**
     * Adds a HasType property value.<p>
     * 
     * @param newHasType the HasType property value to be added
     */
    void addHasType(AircraftType newHasType);

    /**
     * Removes a HasType property value.<p>
     * 
     * @param oldHasType the HasType property value to be removed.
     */
    void removeHasType(AircraftType oldHasType);


    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#aircraft_id
     */
     
    /**
     * Gets all property values for the aircraft_id property.<p>
     * 
     * @returns a collection of values for the aircraft_id property.
     */
    Collection<? extends String> getAircraft_id();

    /**
     * Checks if the class has a aircraft_id property value.<p>
     * 
     * @return true if there is a aircraft_id property value.
     */
    boolean hasAircraft_id();

    /**
     * Adds a aircraft_id property value.<p>
     * 
     * @param newAircraft_id the aircraft_id property value to be added
     */
    void addAircraft_id(String newAircraft_id);

    /**
     * Removes a aircraft_id property value.<p>
     * 
     * @param oldAircraft_id the aircraft_id property value to be removed.
     */
    void removeAircraft_id(String oldAircraft_id);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airport_name
     */
     
    /**
     * Gets all property values for the airport_name property.<p>
     * 
     * @returns a collection of values for the airport_name property.
     */
    Collection<? extends String> getAirport_name();

    /**
     * Checks if the class has a airport_name property value.<p>
     * 
     * @return true if there is a airport_name property value.
     */
    boolean hasAirport_name();

    /**
     * Adds a airport_name property value.<p>
     * 
     * @param newAirport_name the airport_name property value to be added
     */
    void addAirport_name(String newAirport_name);

    /**
     * Removes a airport_name property value.<p>
     * 
     * @param oldAirport_name the airport_name property value to be removed.
     */
    void removeAirport_name(String oldAirport_name);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#class
     */
     
    /**
     * Gets all property values for the class property.<p>
     * 
     * @returns a collection of values for the class property.
     */
    Collection<? extends String> getClass();

    /**
     * Checks if the class has a class property value.<p>
     * 
     * @return true if there is a class property value.
     */
    boolean hasClass();

    /**
     * Adds a class property value.<p>
     * 
     * @param newClass the class property value to be added
     */
    void addClass(String newClass);

    /**
     * Removes a class property value.<p>
     * 
     * @param oldClass the class property value to be removed.
     */
    void removeClass(String oldClass);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#engine_count
     */
     
    /**
     * Gets all property values for the engine_count property.<p>
     * 
     * @returns a collection of values for the engine_count property.
     */
    Collection<? extends Integer> getEngine_count();

    /**
     * Checks if the class has a engine_count property value.<p>
     * 
     * @return true if there is a engine_count property value.
     */
    boolean hasEngine_count();

    /**
     * Adds a engine_count property value.<p>
     * 
     * @param newEngine_count the engine_count property value to be added
     */
    void addEngine_count(Integer newEngine_count);

    /**
     * Removes a engine_count property value.<p>
     * 
     * @param oldEngine_count the engine_count property value to be removed.
     */
    void removeEngine_count(Integer oldEngine_count);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#manufacturer
     */
     
    /**
     * Gets all property values for the manufacturer property.<p>
     * 
     * @returns a collection of values for the manufacturer property.
     */
    Collection<? extends String> getManufacturer();

    /**
     * Checks if the class has a manufacturer property value.<p>
     * 
     * @return true if there is a manufacturer property value.
     */
    boolean hasManufacturer();

    /**
     * Adds a manufacturer property value.<p>
     * 
     * @param newManufacturer the manufacturer property value to be added
     */
    void addManufacturer(String newManufacturer);

    /**
     * Removes a manufacturer property value.<p>
     * 
     * @param oldManufacturer the manufacturer property value to be removed.
     */
    void removeManufacturer(String oldManufacturer);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#max_speed
     */
     
    /**
     * Gets all property values for the max_speed property.<p>
     * 
     * @returns a collection of values for the max_speed property.
     */
    Collection<? extends Integer> getMax_speed();

    /**
     * Checks if the class has a max_speed property value.<p>
     * 
     * @return true if there is a max_speed property value.
     */
    boolean hasMax_speed();

    /**
     * Adds a max_speed property value.<p>
     * 
     * @param newMax_speed the max_speed property value to be added
     */
    void addMax_speed(Integer newMax_speed);

    /**
     * Removes a max_speed property value.<p>
     * 
     * @param oldMax_speed the max_speed property value to be removed.
     */
    void removeMax_speed(Integer oldMax_speed);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#passengers_capacity
     */
     
    /**
     * Gets all property values for the passengers_capacity property.<p>
     * 
     * @returns a collection of values for the passengers_capacity property.
     */
    Collection<? extends Integer> getPassengers_capacity();

    /**
     * Checks if the class has a passengers_capacity property value.<p>
     * 
     * @return true if there is a passengers_capacity property value.
     */
    boolean hasPassengers_capacity();

    /**
     * Adds a passengers_capacity property value.<p>
     * 
     * @param newPassengers_capacity the passengers_capacity property value to be added
     */
    void addPassengers_capacity(Integer newPassengers_capacity);

    /**
     * Removes a passengers_capacity property value.<p>
     * 
     * @param oldPassengers_capacity the passengers_capacity property value to be removed.
     */
    void removePassengers_capacity(Integer oldPassengers_capacity);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
