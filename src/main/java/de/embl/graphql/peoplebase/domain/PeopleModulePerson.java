package de.embl.graphql.peoplebase.domain;

import lombok.Data;

import java.util.Collection;

@Data
public class PeopleModulePerson {
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String favouriteColour;
    private Collection<String> hobby;
}
