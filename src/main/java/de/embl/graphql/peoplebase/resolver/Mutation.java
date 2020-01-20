package de.embl.graphql.peoplebase.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import de.embl.graphql.peoplebase.agent.IPersonAgent;
import de.embl.graphql.peoplebase.domain.PeopleModulePerson;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Mutation implements GraphQLMutationResolver {
    private final IPersonAgent personAgent;

    public Mutation(IPersonAgent personAgent) {
        this.personAgent = personAgent;
    }

    public PeopleModulePerson createPerson(String firstName, String lastName, Integer age, String favouriteColour, Collection<String> hobby) {
        PeopleModulePerson peopleModulePerson = new PeopleModulePerson();
        peopleModulePerson.setFirstName(firstName);
        peopleModulePerson.setLastName(lastName);
        peopleModulePerson.setAge(age);
        peopleModulePerson.setFavouriteColour(favouriteColour);
        peopleModulePerson.setHobby(hobby);
        return personAgent.createPerson(peopleModulePerson);
    }

    public PeopleModulePerson updatePerson(String id, String firstName, String lastName, Integer age, String favouriteColour, Collection<String> hobby) {
        PeopleModulePerson peopleModulePerson = new PeopleModulePerson();
        peopleModulePerson.setFirstName(firstName);
        peopleModulePerson.setLastName(lastName);
        peopleModulePerson.setAge(age);
        peopleModulePerson.setFavouriteColour(favouriteColour);
        peopleModulePerson.setHobby(hobby);
        return personAgent.updatePerson(peopleModulePerson, id);
    }

    public boolean deletePerson(String id) {
        personAgent.deletePerson(id);
        return true;
    }
}
