package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class loadClass_1 extends A_loadClass__Arrow 
{ 
  public String _1;

  public loadClass_1 (INodeSource source, String _1) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
    { 
      return true;
    }
    if(obj == null)
    { 
      return false;
    }
    if(getClass() != obj.getClass())
    { 
      return false;
    }
    final loadClass_1 other = (loadClass_1)obj;
    if(_1 == null)
    { 
      if(other._1 != null)
      { 
        return false;
      }
    }
    else
      if(!_1.equals(other._1))
      { 
        return false;
      }
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      hasSpecialized = true;
    }
  }

  public R_default_Class exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in18800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26900 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26900 = _4;
    final String c17400000 = this._1;
    final A_This this_119700 = this_in18800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127400 = env_in26900;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> C1500000 = c_in26900;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127400 = store_in26900;
    final A_Class lifted_19420000 = C1500000.get(c17400000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26900 = store_127400;
    final A_Class result_out26900 = lifted_19420000;
    return new R_default_Class(result_out26900, store_out26900);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("loadClass", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}