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


public class DefaultAirfield extends WrappedIndividualImpl implements Airfield {

    public DefaultAirfield(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#ConsistsOf
     */
     
    public Collection<? extends Gate> getConsistsOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_CONSISTSOF,
                                               DefaultGate.class);
    }

    public boolean hasConsistsOf() {
	   return !getConsistsOf().isEmpty();
    }

    public void addConsistsOf(Gate newConsistsOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_CONSISTSOF,
                                       newConsistsOf);
    }

    public void removeConsistsOf(Gate oldConsistsOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_CONSISTSOF,
                                          oldConsistsOf);
    }


    /* ***************************************************
     * Object Property http://www.w3.org/2002/07/owl#topObjectProperty
     */
     
    public Collection<? extends Gate> getOwl:topObjectProperty() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OWL:TOPOBJECTPROPERTY,
                                               DefaultGate.class);
    }

    public boolean hasOwl:topObjectProperty() {
	   return !getOwl:topObjectProperty().isEmpty();
    }

    public void addOwl:topObjectProperty(Gate newOwl:topObjectProperty) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OWL:TOPOBJECTPROPERTY,
                                       newOwl:topObjectProperty);
    }

    public void removeOwl:topObjectProperty(Gate oldOwl:topObjectProperty) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OWL:TOPOBJECTPROPERTY,
                                          oldOwl:topObjectProperty);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airfield_id
     */
     
    public Collection<? extends String> getAirfield_id() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRFIELD_ID, String.class);
    }

    public boolean hasAirfield_id() {
		return !getAirfield_id().isEmpty();
    }

    public void addAirfield_id(String newAirfield_id) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRFIELD_ID, newAirfield_id);
    }

    public void removeAirfield_id(String oldAirfield_id) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AIRFIELD_ID, oldAirfield_id);
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
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#elevation
     */
     
    public Collection<? extends Integer> getElevation() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ELEVATION, Integer.class);
    }

    public boolean hasElevation() {
		return !getElevation().isEmpty();
    }

    public void addElevation(Integer newElevation) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ELEVATION, newElevation);
    }

    public void removeElevation(Integer oldElevation) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ELEVATION, oldElevation);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#usage_type
     */
     
    public Collection<? extends String> getUsage_type() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USAGE_TYPE, String.class);
    }

    public boolean hasUsage_type() {
		return !getUsage_type().isEmpty();
    }

    public void addUsage_type(String newUsage_type) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USAGE_TYPE, newUsage_type);
    }

    public void removeUsage_type(String oldUsage_type) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USAGE_TYPE, oldUsage_type);
    }


}
