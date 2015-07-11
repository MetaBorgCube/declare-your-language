package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initSuper_1 extends A_initSuper__Arrow 
{ 
  @Child public A_Extends _1;

  public initSuper_1 (INodeSource source, A_Extends _1) 
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
    final initSuper_1 other = (initSuper_1)obj;
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

  public R_default_Super exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3100 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3100 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3100 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3100 = _4;
    final A_Extends lifted_1020000 = this._1;
    { 
      final A_This this_13100 = this_in3100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13100 = env_in3100;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_12100 = c_in3100;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13100 = store_in3100;
      final NoExtends_0 $tmp6 = lifted_1020000.match(NoExtends_0.class);
      if($tmp6 != null)
      { 
        final NoSuper_0 lifted_1010000 = new NoSuper_0(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3100 = store_13100;
        final A_Super result_out3100 = lifted_1010000;
        return new R_default_Super(result_out3100, store_out3100);
      }
      else
      { 
        final Extends_1 $tmp7 = lifted_1020000.match(Extends_1.class);
        if($tmp7 != null)
        { 
          final String c4800000 = $tmp7.get_1();
          final loadClass_1 lifted_1040000 = new loadClass_1(this.getSourceInfo(), c4800000);
          final R_default_Class $tmp8 = lifted_1040000.exec_default(this_13100, env_13100, c_12100, store_13100);
          final A_Class lifted_259000 = $tmp8.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_22100 = $tmp8.get_1();
          final initObject_1 lifted_1030000 = new initObject_1(this.getSourceInfo(), lifted_259000);
          final R_default_Obj $tmp9 = lifted_1030000.exec_default(this_13100, env_13100, c_12100, store_22100);
          final A_Obj lifted_263000 = $tmp9.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_31100 = $tmp9.get_1();
          final Super_1 lifted_262000 = new Super_1(this.getSourceInfo(), lifted_263000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3100 = store_31100;
          final A_Super result_out3100 = lifted_262000;
          return new R_default_Super(result_out3100, store_out3100);
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
    }
  }

  public A_Extends get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initSuper", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}