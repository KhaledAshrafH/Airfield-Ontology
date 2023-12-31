package Airfield;



import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;



public class Vocabulary {

	private static final OWLDataFactory factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Aircraft
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class AIRCRAFT.<p>
     * 
     */
    public static final OWLClass CLASS_AIRCRAFT = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Aircraft"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#AircraftType
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class AIRCRAFTTYPE.<p>
     * 
     */
    public static final OWLClass CLASS_AIRCRAFTTYPE = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#AircraftType"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Airfield
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class AIRFIELD.<p>
     * 
     */
    public static final OWLClass CLASS_AIRFIELD = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Airfield"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Airport
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class AIRPORT.<p>
     * 
     */
    public static final OWLClass CLASS_AIRPORT = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Airport"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Gate
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class GATE.<p>
     * 
     */
    public static final OWLClass CLASS_GATE = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Gate"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#GroundSurface
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class GROUNDSURFACE.<p>
     * 
     */
    public static final OWLClass CLASS_GROUNDSURFACE = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#GroundSurface"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Runway
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class RUNWAY.<p>
     * 
     */
    public static final OWLClass CLASS_RUNWAY = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Runway"));

    /* ***************************************************
     * Class http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Taxiway
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class TAXIWAY.<p>
     * 
     */
    public static final OWLClass CLASS_TAXIWAY = factory.getOWLClass(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#Taxiway"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#AtPosition
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property ATPOSITION.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_ATPOSITION = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#AtPosition"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#CompatibleWith
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property COMPATIBLEWITH.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_COMPATIBLEWITH = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#CompatibleWith"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#ConsistsOf
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property CONSISTSOF.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_CONSISTSOF = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#ConsistsOf"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HasType
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property HASTYPE.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_HASTYPE = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HasType"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HaveAircraft
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property HAVEAIRCRAFT.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_HAVEAIRCRAFT = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#HaveAircraft"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#LeadTo
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property LEADTO.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_LEADTO = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#LeadTo"));

    /* ***************************************************
     * Object Property http://www.w3.org/2002/07/owl#topObjectProperty
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property OWL:TOPOBJECTPROPERTY.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_OWL:TOPOBJECTPROPERTY = factory.getOWLObjectProperty(IRI.create("http://www.w3.org/2002/07/owl#topObjectProperty"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#aircraft_id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property AIRCRAFT_ID.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_AIRCRAFT_ID = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#aircraft_id"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airfield_id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property AIRFIELD_ID.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_AIRFIELD_ID = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airfield_id"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airport_name
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property AIRPORT_NAME.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_AIRPORT_NAME = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#airport_name"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#capacity
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property CAPACITY.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_CAPACITY = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#capacity"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#class
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property CLASS.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_CLASS = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#class"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#compatible_with
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property COMPATIBLE_WITH.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_COMPATIBLE_WITH = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#compatible_with"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#elevation
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property ELEVATION.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_ELEVATION = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#elevation"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#engine_count
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property ENGINE_COUNT.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_ENGINE_COUNT = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#engine_count"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#gate_number
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property GATE_NUMBER.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_GATE_NUMBER = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#gate_number"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#length
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property LENGTH.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_LENGTH = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#length"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#maintenance_status
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MAINTENANCE_STATUS.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MAINTENANCE_STATUS = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#maintenance_status"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#manufacturer
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MANUFACTURER.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MANUFACTURER = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#manufacturer"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#max_speed
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MAX_SPEED.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MAX_SPEED = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#max_speed"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#passengers_capacity
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property PASSENGERS_CAPACITY.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_PASSENGERS_CAPACITY = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#passengers_capacity"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_name
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property RUNWAY_NAME.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_RUNWAY_NAME = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_name"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_type
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property RUNWAY_TYPE.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_RUNWAY_TYPE = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#runway_type"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#taxiway_name
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property TAXIWAY_NAME.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_TAXIWAY_NAME = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#taxiway_name"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#usage_type
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property USAGE_TYPE.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_USAGE_TYPE = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/5aleda4rf/ontologies/2022/11/untitled-ontology-10#usage_type"));

    /* ***************************************************
     * Data Property http://www.w3.org/2002/07/owl#topDataProperty
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property OWL:TOPDATAPROPERTY.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_OWL:TOPDATAPROPERTY = factory.getOWLDataProperty(IRI.create("http://www.w3.org/2002/07/owl#topDataProperty"));


}
