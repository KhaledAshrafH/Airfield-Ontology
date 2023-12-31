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


public class DefaultTaxiway extends WrappedIndividualImpl implements Taxiway {

    public DefaultTaxiway(CodeGenerationInference inference, IRI iri) {
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
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#maintenance_status
     */
     
    public Collection<? extends String> getMaintenance_status() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAINTENANCE_STATUS, String.class);
    }

    public boolean hasMaintenance_status() {
		return !getMaintenance_status().isEmpty();
    }

    public void addMaintenance_status(String newMaintenance_status) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAINTENANCE_STATUS, newMaintenance_status);
    }

    public void removeMaintenance_status(String oldMaintenance_status) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAINTENANCE_STATUS, oldMaintenance_status);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#taxiway_name
     */
     
    public Collection<? extends String> getTaxiway_name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TAXIWAY_NAME, String.class);
    }

    public boolean hasTaxiway_name() {
		return !getTaxiway_name().isEmpty();
    }

    public void addTaxiway_name(String newTaxiway_name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TAXIWAY_NAME, newTaxiway_name);
    }

    public void removeTaxiway_name(String oldTaxiway_name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TAXIWAY_NAME, oldTaxiway_name);
    }


}
