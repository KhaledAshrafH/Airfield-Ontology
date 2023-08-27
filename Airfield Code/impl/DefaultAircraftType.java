package Airfield.impl;

import Airfield.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


public class DefaultAircraftType extends WrappedIndividualImpl implements AircraftType {

    public DefaultAircraftType(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#AtPosition
     */
     
    public Collection<? extends GroundSurface> getAtPosition() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ATPOSITION,
                                               DefaultGroundSurface.class);
    }

    public boolean hasAtPosition() {
	   return !getAtPosition().isEmpty();
    }

    public void addAtPosition(GroundSurface newAtPosition) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ATPOSITION,
                                       newAtPosition);
    }

    public void removeAtPosition(GroundSurface oldAtPosition) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ATPOSITION,
                                          oldAtPosition);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HasType
     */
     
    public Collection<? extends AircraftType> getHasType() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASTYPE,
                                               DefaultAircraftType.class);
    }

    public boolean hasHasType() {
	   return !getHasType().isEmpty();
    }

    public void addHasType(AircraftType newHasType) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASTYPE,
                                       newHasType);
    }

    public void removeHasType(AircraftType oldHasType) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASTYPE,
                                          oldHasType);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#aircraft_id
     */
     
    public Collection<? extends String> getAircraft_id() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRCRAFT_ID, String.class);
    }

    public boolean hasAircraft_id() {
		return !getAircraft_id().isEmpty();
    }

    public void addAircraft_id(String newAircraft_id) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRCRAFT_ID, newAircraft_id);
    }

    public void removeAircraft_id(String oldAircraft_id) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRCRAFT_ID, oldAircraft_id);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airport_name
     */
     
    public Collection<? extends String> getAirport_name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRPORT_NAME, String.class);
    }

    public boolean hasAirport_name() {
		return !getAirport_name().isEmpty();
    }

    public void addAirport_name(String newAirport_name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRPORT_NAME, newAirport_name);
    }

    public void removeAirport_name(String oldAirport_name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRPORT_NAME, oldAirport_name);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#class
     */
     
    public Collection<? extends String> getClass() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS, String.class);
    }

    public boolean hasClass() {
		return !getClass().isEmpty();
    }

    public void addClass(String newClass) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS, newClass);
    }

    public void removeClass(String oldClass) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS, oldClass);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#engine_count
     */
     
    public Collection<? extends Integer> getEngine_count() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ENGINE_COUNT, Integer.class);
    }

    public boolean hasEngine_count() {
		return !getEngine_count().isEmpty();
    }

    public void addEngine_count(Integer newEngine_count) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ENGINE_COUNT, newEngine_count);
    }

    public void removeEngine_count(Integer oldEngine_count) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ENGINE_COUNT, oldEngine_count);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#manufacturer
     */
     
    public Collection<? extends String> getManufacturer() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MANUFACTURER, String.class);
    }

    public boolean hasManufacturer() {
		return !getManufacturer().isEmpty();
    }

    public void addManufacturer(String newManufacturer) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MANUFACTURER, newManufacturer);
    }

    public void removeManufacturer(String oldManufacturer) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MANUFACTURER, oldManufacturer);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#max_speed
     */
     
    public Collection<? extends Integer> getMax_speed() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAX_SPEED, Integer.class);
    }

    public boolean hasMax_speed() {
		return !getMax_speed().isEmpty();
    }

    public void addMax_speed(Integer newMax_speed) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAX_SPEED, newMax_speed);
    }

    public void removeMax_speed(Integer oldMax_speed) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAX_SPEED, oldMax_speed);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#passengers_capacity
     */
     
    public Collection<? extends Integer> getPassengers_capacity() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PASSENGERS_CAPACITY, Integer.class);
    }

    public boolean hasPassengers_capacity() {
		return !getPassengers_capacity().isEmpty();
    }

    public void addPassengers_capacity(Integer newPassengers_capacity) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PASSENGERS_CAPACITY, newPassengers_capacity);
    }

    public void removePassengers_capacity(Integer oldPassengers_capacity) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PASSENGERS_CAPACITY, oldPassengers_capacity);
    }


}
