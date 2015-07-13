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

  public R_default_Super exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24600 = _3;
    final A_Extends lifted_17290000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125100 = env_in24600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129500 = c_in24600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125100 = store_in24600;
      final NoExtends_0 $tmp504 = lifted_17290000.match(NoExtends_0.class);
      if($tmp504 != null)
      { 
        final NoSuper_0 lifted_17280000 = new NoSuper_0(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24600 = store_125100;
        final A_Super result_out24600 = lifted_17280000;
        return new R_default_Super(result_out24600, store_out24600);
      }
      else
      { 
        final Extends_1 $tmp505 = lifted_17290000.match(Extends_1.class);
        if($tmp505 != null)
        { 
          final String c13400000 = $tmp505.get_1();
          final loadClass_1 lifted_17320000 = new loadClass_1(this.getSourceInfo(), c13400000);
          final R_default_Class $tmp506 = lifted_17320000.exec_default(env_125100, c_129500, store_125100);
          final A_Class lifted_1822000 = $tmp506.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218100 = $tmp506.get_1();
          final initObject_1 lifted_17310000 = new initObject_1(this.getSourceInfo(), lifted_1822000);
          final R_default_Obj $tmp507 = lifted_17310000.exec_default(env_125100, c_129500, store_218100);
          final A_Obj lifted_1825000 = $tmp507.value;
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_311600 = $tmp507.get_1();
          final Super_1 lifted_1824000 = new Super_1(this.getSourceInfo(), lifted_1825000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24600 = store_311600;
          final A_Super result_out24600 = lifted_1824000;
          return new R_default_Super(result_out24600, store_out24600);
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3);
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