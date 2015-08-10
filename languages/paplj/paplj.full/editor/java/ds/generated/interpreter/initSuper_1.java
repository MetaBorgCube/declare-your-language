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
    final A_This this_in19200 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27300 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27300 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27300 = _4;
    final A_Extends lifted_19540000 = this._1;
    { 
      final A_This this_120100 = this_in19200;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127700 = env_in27300;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132500 = c_in27300;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127700 = store_in27300;
      final NoExtends_0 $tmp547 = lifted_19540000.match(NoExtends_0.class);
      if($tmp547 != null)
      { 
        final NoSuper_0 lifted_19530000 = new NoSuper_0(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27300 = store_127700;
        final A_Super result_out27300 = lifted_19530000;
        return new R_default_Super(result_out27300, store_out27300);
      }
      else
      { 
        final Extends_1 $tmp548 = lifted_19540000.match(Extends_1.class);
        if($tmp548 != null)
        { 
          final String c17500000 = $tmp548.get_1();
          final loadClass_1 lifted_19560000 = new loadClass_1(this.getSourceInfo(), c17500000);
          final R_default_Class $tmp549 = lifted_19560000.exec_default(this_120100, env_127700, c_132500, store_127700);
          final A_Class lifted_2117000 = $tmp549.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219700 = $tmp549.get_1();
          final initObject_1 lifted_19550000 = new initObject_1(this.getSourceInfo(), lifted_2117000);
          final R_default_Obj $tmp550 = lifted_19550000.exec_default(this_120100, env_127700, c_132500, store_219700);
          final A_Obj lifted_2120000 = $tmp550.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_312500 = $tmp550.get_1();
          final Super_1 lifted_2119000 = new Super_1(this.getSourceInfo(), lifted_2120000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27300 = store_312500;
          final A_Super result_out27300 = lifted_2119000;
          return new R_default_Super(result_out27300, store_out27300);
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