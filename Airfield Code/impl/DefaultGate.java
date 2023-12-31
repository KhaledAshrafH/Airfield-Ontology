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



public class DefaultGate extends WrappedIndividualImpl implements Gate {

    public DefaultGate(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#CompatibleWith
     */
     
    public Collection<? extends AircraftType> getCompatibleWith() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_COMPATIBLEWITH,
                                               DefaultAircraftType.class);
    }

    public boolean hasCompatibleWith() {
	   return !getCompatibleWith().isEmpty();
    }

    public void addCompatibleWith(AircraftType newCompatibleWith) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_COMPATIBLEWITH,
                                       newCompatibleWith);
    }

    public void removeCompatibleWith(AircraftType oldCompatibleWith) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_COMPATIBLEWITH,
                                          oldCompatibleWith);
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
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#capacity
     */
     
    public Collection<? extends Integer> getCapacity() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CAPACITY, Integer.class);
    }

    public boolean hasCapacity() {
		return !getCapacity().isEmpty();
    }

    public void addCapacity(Integer newCapacity) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CAPACITY, newCapacity);
    }

    public void removeCapacity(Integer oldCapacity) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CAPACITY, oldCapacity);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#compatible_with
     */
     
    public Collection<? extends String> getCompatible_with() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMPATIBLE_WITH, String.class);
    }

    public boolean hasCompatible_with() {
		return !getCompatible_with().isEmpty();
    }

    public void addCompatible_with(String newCompatible_with) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMPATIBLE_WITH, newCompatible_with);
    }

    public void removeCompatible_with(String oldCompatible_with) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMPATIBLE_WITH, oldCompatible_with);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#gate_number
     */
     
    public Collection<? extends String> getGate_number() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_GATE_NUMBER, String.class);
    }

    public boolean hasGate_number() {
		return !getGate_number().isEmpty();
    }

    public void addGate_number(String newGate_number) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_GATE_NUMBER, newGate_number);
    }

    public void removeGate_number(String oldGate_number) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_GATE_NUMBER, oldGate_number);
    }


}
