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
    final A_This this_in19100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27200 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27200 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27200 = _4;
    final A_Class lifted_19570000 = this._1;
    { 
      final A_This this_119900 = this_in19100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127600 = env_in27200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132400 = c_in27200;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127600 = store_in27200;
      final Class_4 $tmp543 = lifted_19570000.match(Class_4.class);
      if($tmp543 != null)
      { 
        final String c17600000 = $tmp543.get_1();
        final A_Extends ext1500000 = $tmp543.get_2();
        final L_A_Field fs6100000 = $tmp543.get_3();
        final L_A_Method ms6100000 = $tmp543.get_4();
        final initSuper_1 lifted_19590000 = new initSuper_1(this.getSourceInfo(), ext1500000);
        final initFields_1 lifted_19610000 = new initFields_1(this.getSourceInfo(), fs6100000);
        final initMethods_1 lifted_19620000 = new initMethods_1(this.getSourceInfo(), ms6100000);
        final R_default_Super $tmp544 = lifted_19590000.exec_default(this_119900, env_127600, c_132400, store_127600);
        final A_Super lifted_2122000 = $tmp544.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219600 = $tmp544.get_1();
        final R_default_FM $tmp545 = lifted_19610000.exec_default(this_119900, env_127600, c_132400, store_219600);
        final com.github.krukow.clj_ds.PersistentMap<String, Integer> lifted_2123000 = $tmp545.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312400 = $tmp545.get_1();
        final R_default_MM $tmp546 = lifted_19620000.exec_default(this_119900, env_127600, c_132400, store_312400);
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_2124000 = $tmp546.value;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_42800 = $tmp546.get_1();
        final ObjV_4 lifted_19580000 = new ObjV_4(this.getSourceInfo(), c17600000, lifted_2122000, lifted_2123000, lifted_2124000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27200 = store_42800;
        final A_Obj result_out27200 = lifted_19580000;
        return new R_default_Obj(result_out27200, store_out27200);
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