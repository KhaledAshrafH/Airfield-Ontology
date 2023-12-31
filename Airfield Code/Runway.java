package Airfield;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;



public interface Runway extends GroundSurface {

    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HaveAircraft
     */
     
    /**
     * Gets all property values for the HaveAircraft property.<p>
     * 
     * @returns a collection of values for the HaveAircraft property.
     */
    Collection<? extends Aircraft> getHaveAircraft();

    /**
     * Checks if the class has a HaveAircraft property value.<p>
     * 
     * @return true if there is a HaveAircraft property value.
     */
    boolean hasHaveAircraft();

    /**
     * Adds a HaveAircraft property value.<p>
     * 
     * @param newHaveAircraft the HaveAircraft property value to be added
     */
    void addHaveAircraft(Aircraft newHaveAircraft);

    /**
     * Removes a HaveAircraft property value.<p>
     * 
     * @param oldHaveAircraft the HaveAircraft property value to be removed.
     */
    void removeHaveAircraft(Aircraft oldHaveAircraft);


    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#LeadTo
     */
     
    /**
     * Gets all property values for the LeadTo property.<p>
     * 
     * @returns a collection of values for the LeadTo property.
     */
    Collection<? extends Taxiway> getLeadTo();

    /**
     * Checks if the class has a LeadTo property value.<p>
     * 
     * @return true if there is a LeadTo property value.
     */
    boolean hasLeadTo();

    /**
     * Adds a LeadTo property value.<p>
     * 
     * @param newLeadTo the LeadTo property value to be added
     */
    void addLeadTo(Taxiway newLeadTo);

    /**
     * Removes a LeadTo property value.<p>
     * 
     * @param oldLeadTo the LeadTo property value to be removed.
     */
    void removeLeadTo(Taxiway oldLeadTo);


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
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#length
     */
     
    /**
     * Gets all property values for the length property.<p>
     * 
     * @returns a collection of values for the length property.
     */
    Collection<? extends Integer> getLength();

    /**
     * Checks if the class has a length property value.<p>
     * 
     * @return true if there is a length property value.
     */
    boolean hasLength();

    /**
     * Adds a length property value.<p>
     * 
     * @param newLength the length property value to be added
     */
    void addLength(Integer newLength);

    /**
     * Removes a length property value.<p>
     * 
     * @param oldLength the length property value to be removed.
     */
    void removeLength(Integer oldLength);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_name
     */
     
    /**
     * Gets all property values for the runway_name property.<p>
     * 
     * @returns a collection of values for the runway_name property.
     */
    Collection<? extends String> getRunway_name();

    /**
     * Checks if the class has a runway_name property value.<p>
     * 
     * @return true if there is a runway_name property value.
     */
    boolean hasRunway_name();

    /**
     * Adds a runway_name property value.<p>
     * 
     * @param newRunway_name the runway_name property value to be added
     */
    void addRunway_name(String newRunway_name);

    /**
     * Removes a runway_name property value.<p>
     * 
     * @param oldRunway_name the runway_name property value to be removed.
     */
    void removeRunway_name(String oldRunway_name);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_type
     */
     
    /**
     * Gets all property values for the runway_type property.<p>
     * 
     * @returns a collection of values for the runway_type property.
     */
    Collection<? extends String> getRunway_type();

    /**
     * Checks if the class has a runway_type property value.<p>
     * 
     * @return true if there is a runway_type property value.
     */
    boolean hasRunway_type();

    /**
     * Adds a runway_type property value.<p>
     * 
     * @param newRunway_type the runway_type property value to be added
     */
    void addRunway_type(String newRunway_type);

    /**
     * Removes a runway_type property value.<p>
     * 
     * @param oldRunway_type the runway_type property value to be removed.
     */
    void removeRunway_type(String oldRunway_type);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
