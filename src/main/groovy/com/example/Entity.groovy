package com.example

import groovy.transform.CompileStatic

import javax.persistence.Id

@javax.persistence.Entity
@CompileStatic
class Entity {
	@Id
	Long id

	String name

}
