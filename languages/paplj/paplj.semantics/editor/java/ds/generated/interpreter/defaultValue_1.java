package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class defaultValue_1 extends A_defaultValue__Arrow 
{ 
  @Child public A_Type _1;

  public defaultValue_1 (INodeSource source, A_Type _1) 
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
    final defaultValue_1 other = (defaultValue_1)obj;
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

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24900 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24900 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24900 = _3;
    final A_Type lifted_17730000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125400 = env_in24900;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129800 = c_in24900;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125400 = store_in24900;
      final NumT_0 $tmp514 = lifted_17730000.match(NumT_0.class);
      if($tmp514 != null)
      { 
        final int lifted_17690000 = 0;
        final NumV_1 lifted_17680000 = new NumV_1(this.getSourceInfo(), lifted_17690000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24900 = store_125400;
        final A_V result_out24900 = lifted_17680000;
        return new R_default_V(result_out24900, store_out24900);
      }
      else
      { 
        final BoolT_0 $tmp515 = lifted_17730000.match(BoolT_0.class);
        if($tmp515 != null)
        { 
          final boolean lifted_17720000 = false;
          final BoolV_1 lifted_17710000 = new BoolV_1(this.getSourceInfo(), lifted_17720000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24900 = store_125400;
          final A_V result_out24900 = lifted_17710000;
          return new R_default_V(result_out24900, store_out24900);
        }
        else
        { 
          final ClassT_1 $tmp516 = lifted_17730000.match(ClassT_1.class);
          if($tmp516 != null)
          { 
            final String lifted_16940000 = $tmp516.get_1();
            final NullV_0 lifted_17740000 = new NullV_0(this.getSourceInfo());
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24900 = store_125400;
            final A_V result_out24900 = lifted_17740000;
            return new R_default_V(result_out24900, store_out24900);
          }
          else
          { }
        }
      }
    }
    { 
      return super.exec_default(_1, _2, _3);
    }
  }

  public A_Type get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("defaultValue", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}