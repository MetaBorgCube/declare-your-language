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
    final A_This this_in19500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in27600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in27600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in27600 = _4;
    final A_Type lifted_20210000 = this._1;
    { 
      final A_This this_120400 = this_in19500;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_128100 = env_in27600;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132900 = c_in27600;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_128100 = store_in27600;
      final NumT_0 $tmp557 = lifted_20210000.match(NumT_0.class);
      if($tmp557 != null)
      { 
        final int lifted_20160000 = 0;
        final NumV_1 lifted_20150000 = new NumV_1(this.getSourceInfo(), lifted_20160000);
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27600 = store_128100;
        final A_V result_out27600 = lifted_20150000;
        return new R_default_V(result_out27600, store_out27600);
      }
      else
      { 
        final BoolT_0 $tmp558 = lifted_20210000.match(BoolT_0.class);
        if($tmp558 != null)
        { 
          final boolean lifted_20190000 = false;
          final BoolV_1 lifted_20180000 = new BoolV_1(this.getSourceInfo(), lifted_20190000);
          final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27600 = store_128100;
          final A_V result_out27600 = lifted_20180000;
          return new R_default_V(result_out27600, store_out27600);
        }
        else
        { 
          final ClassT_1 $tmp559 = lifted_20210000.match(ClassT_1.class);
          if($tmp559 != null)
          { 
            final String lifted_18610000 = $tmp559.get_1();
            final NullV_0 lifted_20220000 = new NullV_0(this.getSourceInfo());
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out27600 = store_128100;
            final A_V result_out27600 = lifted_20220000;
            return new R_default_V(result_out27600, store_out27600);
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