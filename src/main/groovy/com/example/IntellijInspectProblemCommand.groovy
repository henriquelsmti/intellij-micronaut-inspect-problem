package com.example

import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine.Command
import picocli.CommandLine.Option

import javax.inject.Inject

@Command(name = 'intellij-inspect-problem', description = '...',
        mixinStandardHelpOptions = true)
class IntellijInspectProblemCommand implements Runnable {

    @Inject
    TransactionalExemple transactionalExemple

    @Inject
    Exemple exemple

    @Option(names = ['-v', '--verbose'], description = '...')
    boolean verbose

    static void main(String[] args) throws Exception {
        PicocliRunner.run(IntellijInspectProblemCommand.class, args)
    }

    void run() {
        exemple.toDo()
        transactionalExemple.toDo()
        if (verbose) {
            println "Hi!"
        }
    }
}
