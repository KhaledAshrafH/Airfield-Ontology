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


public class DefaultRunway extends WrappedIndividualImpl implements Runway {

    public DefaultRunway(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HaveAircraft
     */
     
    public Collection<? extends Aircraft> getHaveAircraft() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAVEAIRCRAFT,
                                               DefaultAircraft.class);
    }

    public boolean hasHaveAircraft() {
	   return !getHaveAircraft().isEmpty();
    }

    public void addHaveAircraft(Aircraft newHaveAircraft) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAVEAIRCRAFT,
                                       newHaveAircraft);
    }

    public void removeHaveAircraft(Aircraft oldHaveAircraft) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAVEAIRCRAFT,
                                          oldHaveAircraft);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#LeadTo
     */
     
    public Collection<? extends Taxiway> getLeadTo() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_LEADTO,
                                               DefaultTaxiway.class);
    }

    public boolean hasLeadTo() {
	   return !getLeadTo().isEmpty();
    }

    public void addLeadTo(Taxiway newLeadTo) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_LEADTO,
                                       newLeadTo);
    }

    public void removeLeadTo(Taxiway oldLeadTo) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_LEADTO,
                                          oldLeadTo);
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
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#length
     */
     
    public Collection<? extends Integer> getLength() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LENGTH, Integer.class);
    }

    public boolean hasLength() {
		return !getLength().isEmpty();
    }

    public void addLength(Integer newLength) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LENGTH, newLength);
    }

    public void removeLength(Integer oldLength) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LENGTH, oldLength);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_name
     */
     
    public Collection<? extends String> getRunway_name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RUNWAY_NAME, String.class);
    }

    public boolean hasRunway_name() {
		return !getRunway_name().isEmpty();
    }

    public void addRunway_name(String newRunway_name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RUNWAY_NAME, newRunway_name);
    }

    public void removeRunway_name(String oldRunway_name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RUNWAY_NAME, oldRunway_name);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_type
     */
     
    public Collection<? extends String> getRunway_type() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RUNWAY_TYPE, String.class);
    }

    public boolean hasRunway_type() {
		return !getRunway_type().isEmpty();
    }

    public void addRunway_type(String newRunway_type) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RUNWAY_TYPE, newRunway_type);
    }

    public void removeRunway_type(String oldRunway_type) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RUNWAY_TYPE, oldRunway_type);
    }


}
