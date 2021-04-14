package com.example

import groovy.transform.CompileStatic

import javax.inject.Singleton

@Singleton
@CompileStatic
class Exemple {

	String publicVar = 'publicVar'
	String publicFinalVar = 'publicFinalVar'
	private String privateVar = 'privateVar'
	private final String privateFinalVar = 'privateFinalVar'

	void toDo() {
		println(publicVar)
		println(publicFinalVar)
		println(privateVar)
		println(privateFinalVar)
	}

}
