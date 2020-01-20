package de.embl.graphql.peoplebase.repository;

import de.embl.graphql.peoplebase.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
}
