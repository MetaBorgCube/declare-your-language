package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initObject_1 extends A_initObject__Arrow 
{ 
  @Child public A_Class _1;

  public initObject_1 (INodeSource source, A_Class _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final initObject_1 other = (initObject_1)obj;
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_Obj exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24500 = _3;
    final A_Class lifted_17330000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_124900 = env_in24500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129400 = c_in24500;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_124900 = store_in24500;
      final Class_4 $tmp500 = lifted_17330000.match(Class_4.class);
      if($tmp500 != null)
      { 
        final String c13500000 = $tmp500.get_1();
        final A_Extends ext1200000 = $tmp500.get_2();
        final L_A_Field fs4700000 = $tmp500.get_3();
        final L_A_Method ms4700000 = $tmp500.get_4();
        final initSuper_1 lifted_17350000 = new initSuper_1(this.getSourceInfo(), ext1200000);
        final initFields_1 lifted_17360000 = new initFields_1(this.getSourceInfo(), fs4700000);
        final initMethods_1 lifted_17370000 = new initMethods_1(this.getSourceInfo(), ms4700000);
        final R_default_Super $tmp501 = lifted_17350000.exec_default(env_124900, c_129400, store_124900);
        final A_Super lifted_1827000 = $tmp501.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_217900 = $tmp501.get_1();
        final R_default_FM $tmp502 = lifted_17360000.exec_default(env_124900, c_129400, store_217900);
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_1828000 = $tmp502.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_311500 = $tmp502.get_1();
        final R_default_MM $tmp503 = lifted_17370000.exec_default(env_124900, c_129400, store_311500);
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_1829000 = $tmp503.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_42600 = $tmp503.get_1();
        final ObjV_4 lifted_17340000 = new ObjV_4(this.getSourceInfo(), c13500000, lifted_1827000, lifted_1828000, lifted_1829000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24500 = store_42600;
        final A_Obj result_out24500 = lifted_17340000;
        return new R_default_Obj(result_out24500, store_out24500);
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3);
    }
  }

  public A_Class get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initObject", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}