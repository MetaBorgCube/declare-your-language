package org.metborgcube.dyl.languagee;

import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.services.MetaFileLanguageValidator;

public class LangEValidator extends MetaFileLanguageValidator 
{ 
  @Override public Descriptor getDescriptor()
  { 
    return LangEParseController.getDescriptor();
  }
}