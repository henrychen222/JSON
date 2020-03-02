/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_injectable_constructors.htm
 */
package com.example.GuiceDemo.Bindings.JustInTimeBindings.InjectableConstructors;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class SpellCheckerImpl implements SpellChecker {
    @Inject
    @Named("JDBC")
    private String dbUrl;

    public SpellCheckerImpl() {
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
        System.out.println(dbUrl);
    }
}