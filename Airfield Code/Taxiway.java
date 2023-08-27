package Airfield;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;



public interface Taxiway extends GroundSurface {

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
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#maintenance_status
     */
     
    /**
     * Gets all property values for the maintenance_status property.<p>
     * 
     * @returns a collection of values for the maintenance_status property.
     */
    Collection<? extends String> getMaintenance_status();

    /**
     * Checks if the class has a maintenance_status property value.<p>
     * 
     * @return true if there is a maintenance_status property value.
     */
    boolean hasMaintenance_status();

    /**
     * Adds a maintenance_status property value.<p>
     * 
     * @param newMaintenance_status the maintenance_status property value to be added
     */
    void addMaintenance_status(String newMaintenance_status);

    /**
     * Removes a maintenance_status property value.<p>
     * 
     * @param oldMaintenance_status the maintenance_status property value to be removed.
     */
    void removeMaintenance_status(String oldMaintenance_status);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#taxiway_name
     */
     
    /**
     * Gets all property values for the taxiway_name property.<p>
     * 
     * @returns a collection of values for the taxiway_name property.
     */
    Collection<? extends String> getTaxiway_name();

    /**
     * Checks if the class has a taxiway_name property value.<p>
     * 
     * @return true if there is a taxiway_name property value.
     */
    boolean hasTaxiway_name();

    /**
     * Adds a taxiway_name property value.<p>
     * 
     * @param newTaxiway_name the taxiway_name property value to be added
     */
    void addTaxiway_name(String newTaxiway_name);

    /**
     * Removes a taxiway_name property value.<p>
     * 
     * @param oldTaxiway_name the taxiway_name property value to be removed.
     */
    void removeTaxiway_name(String oldTaxiway_name);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
