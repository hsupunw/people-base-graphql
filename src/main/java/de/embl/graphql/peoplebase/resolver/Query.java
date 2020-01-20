package de.embl.graphql.peoplebase.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import de.embl.graphql.peoplebase.agent.IPersonAgent;
import de.embl.graphql.peoplebase.domain.PeopleModulePerson;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Query implements GraphQLQueryResolver {
    private final IPersonAgent personAgent;

    public Query(IPersonAgent personAgent) {
        this.personAgent = personAgent;
    }

    public Collection<PeopleModulePerson> getAllPersons() {
        return personAgent.getAllPersons();
    }

    public PeopleModulePerson getPerson(String id) {
        return personAgent.getPerson(id);
    }
}
