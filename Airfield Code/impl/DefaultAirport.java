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


public class DefaultAirport extends WrappedIndividualImpl implements Airport {

    public DefaultAirport(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
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


}
