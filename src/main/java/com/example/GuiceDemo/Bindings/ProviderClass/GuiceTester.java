/**
 * 3.2 morning
 * https://www.tutorialspoint.com/guice/guice_provider_class.htm
 */
package com.example.GuiceDemo.Bindings.ProviderClass;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}