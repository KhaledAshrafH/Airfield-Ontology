package Airfield;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;



public interface GroundSurface extends Airport {

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
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
