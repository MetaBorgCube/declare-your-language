package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class New_1 extends A_Expr 
{ 
  public String _1;

  public New_1 (INodeSource source, String _1) 
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
    final New_1 other = (New_1)obj;
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

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3200 = _4;
    final String c4400000 = this._1;
    final A_This this_13300 = this_in3200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13300 = env_in3200;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13200 = c_in3200;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13300 = store_in3200;
    final loadClass_1 lifted_670000 = new loadClass_1(this.getSourceInfo(), c4400000);
    final R_default_Class $tmp94 = lifted_670000.exec_default(this_13300, env_13300, c_13200, store_13300);
    final A_Class lifted_237000 = $tmp94.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22800 = $tmp94.get_1();
    final initObject_1 lifted_660000 = new initObject_1(this.getSourceInfo(), lifted_237000);
    final R_default_Obj $tmp95 = lifted_660000.exec_default(this_13300, env_13300, c_13200, store_22800);
    final A_Obj lifted_241000 = $tmp95.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_32000 = $tmp95.get_1();
    final o2v_1 lifted_239000 = new o2v_1(this.getSourceInfo(), lifted_241000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3200 = store_32000;
    final A_V result_out3200 = lifted_239000;
    return new R_default_V(result_out3200, store_out3200);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("New", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}