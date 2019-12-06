package irkoch.spring.petclinic.services;

import irkoch.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
 }
