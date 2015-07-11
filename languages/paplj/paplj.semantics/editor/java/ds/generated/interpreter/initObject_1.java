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

  public R_default_Obj exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in2100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2100 = _4;
    final A_Class lifted_1050000 = this._1;
    { 
      final A_This this_12100 = this_in2100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_12100 = env_in2100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_11100 = c_in2100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_12100 = store_in2100;
      final Class_4 $tmp2 = lifted_1050000.match(Class_4.class);
      if($tmp2 != null)
      { 
        final String c4900000 = $tmp2.get_1();
        final A_Extends ext300000 = $tmp2.get_2();
        final L_A_Field fs1400000 = $tmp2.get_3();
        final L_A_Method ms1400000 = $tmp2.get_4();
        final initSuper_1 lifted_1070000 = new initSuper_1(this.getSourceInfo(), ext300000);
        final initFields_1 lifted_1080000 = new initFields_1(this.getSourceInfo(), fs1400000);
        final initMethods_1 lifted_1090000 = new initMethods_1(this.getSourceInfo(), ms1400000);
        final R_default_Super $tmp3 = lifted_1070000.exec_default(this_12100, env_12100, c_11100, store_12100);
        final A_Super lifted_265000 = $tmp3.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_21100 = $tmp3.get_1();
        final R_default_FM $tmp4 = lifted_1080000.exec_default(this_12100, env_12100, c_11100, store_21100);
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_266000 = $tmp4.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3000 = $tmp4.get_1();
        final R_default_MM $tmp5 = lifted_1090000.exec_default(this_12100, env_12100, c_11100, store_3000);
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_267000 = $tmp5.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_4000 = $tmp5.get_1();
        final ObjV_4 lifted_1060000 = new ObjV_4(this.getSourceInfo(), c4900000, lifted_265000, lifted_266000, lifted_267000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2100 = store_4000;
        final A_Obj result_out2100 = lifted_1060000;
        return new R_default_Obj(result_out2100, store_out2100);
      }
      else
      { }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
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