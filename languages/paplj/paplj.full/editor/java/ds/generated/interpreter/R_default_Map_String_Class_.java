package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.metaborg.meta.interpreter.framework.IConvertibleToStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

public class R_default_Map_String_Class_  implements IConvertibleToStrategoTerm
{ 
  public final com.github.krukow.clj_ds.PersistentMap<String, A_Class> value;

  public com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _1;

  public R_default_Map_String_Class_ (com.github.krukow.clj_ds.PersistentMap<String, A_Class> value, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _1) 
  { 
    this.value = value;
    this._1 = _1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return factory.makeAppl(factory.makeConstructor("R_default_Map_String_Class_", 2), AutoMapUtils.map_String_A_Class2aterm(value, factory), AutoMapUtils.map_int_A_V2aterm(_1, factory));
  }

  public com.github.krukow.clj_ds.PersistentMap<Integer, A_V> get_1()
  { 
    return this._1;
  }
}