package Airfield;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;



public interface Airfield extends Airport {

    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#ConsistsOf
     */
     
    /**
     * Gets all property values for the ConsistsOf property.<p>
     * 
     * @returns a collection of values for the ConsistsOf property.
     */
    Collection<? extends Gate> getConsistsOf();

    /**
     * Checks if the class has a ConsistsOf property value.<p>
     * 
     * @return true if there is a ConsistsOf property value.
     */
    boolean hasConsistsOf();

    /**
     * Adds a ConsistsOf property value.<p>
     * 
     * @param newConsistsOf the ConsistsOf property value to be added
     */
    void addConsistsOf(Gate newConsistsOf);

    /**
     * Removes a ConsistsOf property value.<p>
     * 
     * @param oldConsistsOf the ConsistsOf property value to be removed.
     */
    void removeConsistsOf(Gate oldConsistsOf);


    /* ***************************************************
     * Property http://www.w3.org/2002/07/owl#topObjectProperty
     */
     
    /**
     * Gets all property values for the owl:topObjectProperty property.<p>
     * 
     * @returns a collection of values for the owl:topObjectProperty property.
     */
    Collection<? extends Gate> getOwl:topObjectProperty();

    /**
     * Checks if the class has a owl:topObjectProperty property value.<p>
     * 
     * @return true if there is a owl:topObjectProperty property value.
     */
    boolean hasOwl:topObjectProperty();

    /**
     * Adds a owl:topObjectProperty property value.<p>
     * 
     * @param newOwl:topObjectProperty the owl:topObjectProperty property value to be added
     */
    void addOwl:topObjectProperty(Gate newOwl:topObjectProperty);

    /**
     * Removes a owl:topObjectProperty property value.<p>
     * 
     * @param oldOwl:topObjectProperty the owl:topObjectProperty property value to be removed.
     */
    void removeOwl:topObjectProperty(Gate oldOwl:topObjectProperty);


    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airfield_id
     */
     
    /**
     * Gets all property values for the airfield_id property.<p>
     * 
     * @returns a collection of values for the airfield_id property.
     */
    Collection<? extends String> getAirfield_id();

    /**
     * Checks if the class has a airfield_id property value.<p>
     * 
     * @return true if there is a airfield_id property value.
     */
    boolean hasAirfield_id();

    /**
     * Adds a airfield_id property value.<p>
     * 
     * @param newAirfield_id the airfield_id property value to be added
     */
    void addAirfield_id(String newAirfield_id);

    /**
     * Removes a airfield_id property value.<p>
     * 
     * @param oldAirfield_id the airfield_id property value to be removed.
     */
    void removeAirfield_id(String oldAirfield_id);



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
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#elevation
     */
     
    /**
     * Gets all property values for the elevation property.<p>
     * 
     * @returns a collection of values for the elevation property.
     */
    Collection<? extends Integer> getElevation();

    /**
     * Checks if the class has a elevation property value.<p>
     * 
     * @return true if there is a elevation property value.
     */
    boolean hasElevation();

    /**
     * Adds a elevation property value.<p>
     * 
     * @param newElevation the elevation property value to be added
     */
    void addElevation(Integer newElevation);

    /**
     * Removes a elevation property value.<p>
     * 
     * @param oldElevation the elevation property value to be removed.
     */
    void removeElevation(Integer oldElevation);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#usage_type
     */
     
    /**
     * Gets all property values for the usage_type property.<p>
     * 
     * @returns a collection of values for the usage_type property.
     */
    Collection<? extends String> getUsage_type();

    /**
     * Checks if the class has a usage_type property value.<p>
     * 
     * @return true if there is a usage_type property value.
     */
    boolean hasUsage_type();

    /**
     * Adds a usage_type property value.<p>
     * 
     * @param newUsage_type the usage_type property value to be added
     */
    void addUsage_type(String newUsage_type);

    /**
     * Removes a usage_type property value.<p>
     * 
     * @param oldUsage_type the usage_type property value to be removed.
     */
    void removeUsage_type(String oldUsage_type);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
