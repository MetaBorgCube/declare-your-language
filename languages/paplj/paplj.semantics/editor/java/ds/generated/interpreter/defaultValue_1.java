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

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in600 = _4;
    final A_Type lifted_1620000 = this._1;
    { 
      final A_This this_1600 = this_in600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_1600 = env_in600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_1500 = c_in600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_1600 = store_in600;
      final NumT_0 $tmp16 = lifted_1620000.match(NumT_0.class);
      if($tmp16 != null)
      { 
        final int lifted_1580000 = 0;
        final NumV_1 lifted_1570000 = new NumV_1(this.getSourceInfo(), lifted_1580000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out600 = store_1600;
        final A_V result_out600 = lifted_1570000;
        return new R_default_V(result_out600, store_out600);
      }
      else
      { 
        final BoolT_0 $tmp17 = lifted_1620000.match(BoolT_0.class);
        if($tmp17 != null)
        { 
          final boolean lifted_1611000 = false;
          final BoolV_1 lifted_1600000 = new BoolV_1(this.getSourceInfo(), lifted_1611000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out600 = store_1600;
          final A_V result_out600 = lifted_1600000;
          return new R_default_V(result_out600, store_out600);
        }
        else
        { 
          final ClassT_1 $tmp18 = lifted_1620000.match(ClassT_1.class);
          if($tmp18 != null)
          { 
            final String lifted_1810000 = $tmp18.get_1();
            final NullV_0 lifted_1630000 = new NullV_0(this.getSourceInfo());
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out600 = store_1600;
            final A_V result_out600 = lifted_1630000;
            return new R_default_V(result_out600, store_out600);
          }
          else
          { }
        }
      }
    }
    { 
      return super.exec_default(_1, _2, _3, _4);
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