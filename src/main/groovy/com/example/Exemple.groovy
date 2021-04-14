package com.example

import groovy.transform.CompileStatic

import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
@CompileStatic
class Exemple {

	String publicVar
	String publicFinalVar
	private String privateVar
	private final String privateFinalVar

	Exemple() {
		publicVar = 'publicVar'
		publicFinalVar = 'publicFinalVar'
		privateVar = 'privateVar'
		privateFinalVar = 'privateFinalVar'
	}

	void toDo() {
		println(publicVar)
		println(publicFinalVar)
		println(privateVar)
		println(privateFinalVar)
	}

}
