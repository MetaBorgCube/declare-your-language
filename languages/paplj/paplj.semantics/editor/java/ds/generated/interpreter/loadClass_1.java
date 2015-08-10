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

  public R_default_Class exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24300 = _3;
    final String c13300000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_124700 = env_in24300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> C1200000 = c_in24300;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_124700 = store_in24300;
    final A_Class lifted_17260000 = C1200000.get(c13300000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24300 = store_124700;
    final A_Class result_out24300 = lifted_17260000;
    return new R_default_Class(result_out24300, store_out24300);
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