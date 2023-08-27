package Airfield;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;



public interface Gate extends Airport {

    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#CompatibleWith
     */
     
    /**
     * Gets all property values for the CompatibleWith property.<p>
     * 
     * @returns a collection of values for the CompatibleWith property.
     */
    Collection<? extends AircraftType> getCompatibleWith();

    /**
     * Checks if the class has a CompatibleWith property value.<p>
     * 
     * @return true if there is a CompatibleWith property value.
     */
    boolean hasCompatibleWith();

    /**
     * Adds a CompatibleWith property value.<p>
     * 
     * @param newCompatibleWith the CompatibleWith property value to be added
     */
    void addCompatibleWith(AircraftType newCompatibleWith);

    /**
     * Removes a CompatibleWith property value.<p>
     * 
     * @param oldCompatibleWith the CompatibleWith property value to be removed.
     */
    void removeCompatibleWith(AircraftType oldCompatibleWith);


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
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#capacity
     */
     
    /**
     * Gets all property values for the capacity property.<p>
     * 
     * @returns a collection of values for the capacity property.
     */
    Collection<? extends Integer> getCapacity();

    /**
     * Checks if the class has a capacity property value.<p>
     * 
     * @return true if there is a capacity property value.
     */
    boolean hasCapacity();

    /**
     * Adds a capacity property value.<p>
     * 
     * @param newCapacity the capacity property value to be added
     */
    void addCapacity(Integer newCapacity);

    /**
     * Removes a capacity property value.<p>
     * 
     * @param oldCapacity the capacity property value to be removed.
     */
    void removeCapacity(Integer oldCapacity);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#compatible_with
     */
     
    /**
     * Gets all property values for the compatible_with property.<p>
     * 
     * @returns a collection of values for the compatible_with property.
     */
    Collection<? extends String> getCompatible_with();

    /**
     * Checks if the class has a compatible_with property value.<p>
     * 
     * @return true if there is a compatible_with property value.
     */
    boolean hasCompatible_with();

    /**
     * Adds a compatible_with property value.<p>
     * 
     * @param newCompatible_with the compatible_with property value to be added
     */
    void addCompatible_with(String newCompatible_with);

    /**
     * Removes a compatible_with property value.<p>
     * 
     * @param oldCompatible_with the compatible_with property value to be removed.
     */
    void removeCompatible_with(String oldCompatible_with);



    /* ***************************************************
     * Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#gate_number
     */
     
    /**
     * Gets all property values for the gate_number property.<p>
     * 
     * @returns a collection of values for the gate_number property.
     */
    Collection<? extends String> getGate_number();

    /**
     * Checks if the class has a gate_number property value.<p>
     * 
     * @return true if there is a gate_number property value.
     */
    boolean hasGate_number();

    /**
     * Adds a gate_number property value.<p>
     * 
     * @param newGate_number the gate_number property value to be added
     */
    void addGate_number(String newGate_number);

    /**
     * Removes a gate_number property value.<p>
     * 
     * @param oldGate_number the gate_number property value to be removed.
     */
    void removeGate_number(String oldGate_number);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
