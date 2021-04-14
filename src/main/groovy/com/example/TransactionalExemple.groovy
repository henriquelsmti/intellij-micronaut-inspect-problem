package com.example

import groovy.transform.CompileStatic

import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
@CompileStatic
@Transactional
class TransactionalExemple {

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
