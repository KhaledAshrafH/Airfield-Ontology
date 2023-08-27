# Airfield Ontology

This repository contains an ontology built using Protégé for modeling the domain of airfields, runways, taxiways, gates, and aircrafts. The ontology captures various constraints and relationships between different entities in the airfield domain.

## Problem Description

The goal of this project is to develop an ontology for airfields that consists of multiple facilities such as runways, taxiways, gates, and maintenance shops. The ontology should capture the attributes and relationships between these entities and enforce certain constraints.

The main entities in the ontology are as follows:

- **Airport**: Represents an airport and has a unique name.
- **Airfield**: Represents the airfield of an airport. It has an elevation, a unique identifier, and a usage type (civilian, military, or charter).
- **Runway**: Represents a runway in the airfield. It has a name, a length, a type (asphalt or grass), and one or more exits leading to taxiways.
- **Taxiway**: Represents a taxiway in the airfield. It has a name, a maintenance status (open or locked), and connects runways and gates.
- **Gate**: Represents a gate in the airfield. It has a gate number, a capacity, and compatibility with specific aircraft types.
- **Aircraft**: Represents an aircraft. It has a unique identification number, a type (e.g., Airbus A330), a manufacturer, a class (wide body or narrow body), engine count, passenger capacity, max speed, and a position (either a taxiway or a runway).

The ontology also includes some rules and constraints to ensure data consistency and validity:

1. No part of the airfield can belong to both a taxiway and a runway simultaneously.
2. The relationship between aircraft and taxiway/runway is bidirectional (using inverse properties).
3. Taxiway and Runway are subclasses of a "ground surface" concept.

## Ontology Structure

The ontology is structured as follows:

- **AirfieldOntology**: The main ontology class representing the airfield domain.
  - **Airport**: Class representing an airport.
    - **hasName**: Object property representing the name of the airport.
  - **Airfield**: Class representing an airfield.
    - **hasElevation**: Data property representing the elevation of the airfield.
    - **hasIdentifier**: Data property representing the unique identifier of the airfield.
    - **hasUsageType**: Data property representing the usage type of the airfield.
    - **hasRunway**: Object property representing the runways in the airfield.
    - **hasTaxiway**: Object property representing the taxiways in the airfield.
    - **hasGate**: Object property representing the gates in the airfield.
  - **Runway**: Class representing a runway.
    - **hasName**: Data property representing the name of the runway.
    - **hasLength**: Data property representing the length of the runway.
    - **hasType**: Data property representing the type of the runway.
    - **hasExit**: Object property representing the exits of the runway.
  - **Taxiway**: Class representing a taxiway.
    - **hasName**: Data property representing the name of the taxiway.
    - **hasMaintenanceStatus**: Data property representing the maintenance status of the taxiway.
    - **connectsTo**: Object property representing the connections between taxiways, runways, and gates.
  - **Gate**: Class representing a gate.
    - **hasNumber**: Data property representing the number of the gate.
    - **hasCapacity**: Data property representing the capacity of the gate.
    - **compatibleWith**: Data property representing the compatibility of the gate with specific aircraft types.
  - **Aircraft**: Class representing an aircraft.
    - **hasID**: Data property representing the identification number of the aircraft.
    - **hasType**: Data property representing the type of the aircraft.
    - **hasManufacturer**: Data property representing the manufacturer of the aircraft.
    - **hasClass**: Data property representing the class of the aircraft.
    - **hasEngineCount**: Data property representing the engine count of the aircraft.
    - **hasCapacity**: Data property representing the passenger capacity of the aircraft.
    - **hasMaxSpeed**: Data property representing the maximum speed of the aircraft.
    - **hasPosition**: Object property representing the position of the aircraft.

## Usage

To make use of this ontology, follow these steps:

1. Install Protégé: Download and install Protégé from the official website (https://protege.stanford.edu/).
2. Open the ontology: Launch Protégé and open the Airfield-Ontology.owl file provided in this repository.
3. Explore the ontology: Use Protégé's interface to navigate and explore the classes, properties, and individuals defined in the ontology.
4. Input data: Fill in the given data in the ontology to createa knowledge base. Add individuals for airports, airfields, runways, taxiways, gates, and aircraft based on the provided information.
5. Run reasoner: Use the built-in reasoner in Protégé to infer logical consequences and check for consistency in the ontology.
6. Analyze results: Examine the inferred information and ensure that the ontology satisfies the constraints and relationships defined in the problem description.
7. Extend and modify: Feel free to extend or modify the ontology to capture additional information or refine the existing structure based on your requirements.


## Contributing

Contributions to this project are welcome. Feel free to fork the repository and submit pull requests to suggest improvements, add new featuresor fix any issues.

## Team

This project was created by a team of four computer science students at Faculty of Computers and Artificial Intelligence Cairo University. The team members are:

- [Khaled Ashraf Hanafy Mahmoud - 20190186](https://github.com/KhaledAshrafH).
- [Ahmed Sayed Hassan Youssef - 20190034](https://github.com/AhmedSayed117).
- [Samah Moustafa Hussien Mahmoud - 20190248](https://github.com/Samah-20190248).
- [Ayatullah Esam El-din Mohamed - 20190123](https://github.com/oshaesam1).

We would like to express our gratitude to all team members for their hard work and contributions to this project.

## Acknowledgments

This project is based on Semantic Web course at Faculty of Computers and Artificial Intelligence Cairo University. We would like to thank Prof. Abeer Elkorany for his guidance and support throughout this course.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.md) file for details.
