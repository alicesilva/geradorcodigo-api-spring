/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.tcc.mydsl.MyDslRuntimeModule;
import org.xtext.tcc.mydsl.MyDslStandaloneSetup;
import org.xtext.tcc.mydsl.ide.MyDslIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyDslIdeSetup extends MyDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyDslRuntimeModule _myDslRuntimeModule = new MyDslRuntimeModule();
    MyDslIdeModule _myDslIdeModule = new MyDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_myDslRuntimeModule, _myDslIdeModule));
  }
}
