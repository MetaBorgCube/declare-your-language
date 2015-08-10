package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class initMethods_1 extends A_initMethods__Arrow 
{ 
  @Children public L_A_Method _1;

  public initMethods_1 (INodeSource source, L_A_Method _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChildren(_1);
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
    final initMethods_1 other = (initMethods_1)obj;
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
      { 
        L_A_Method _1_list = _1;
        while(!_1_list.isEmpty())
        { 
          A_Method _1_elem = _1_list.head();
          if(_1_elem instanceof IGenericNode)
          { 
            ((IGenericNode)_1_elem).specialize(depth);
          }
          _1_list = _1_list.tail();
        }
      }
      hasSpecialized = true;
    }
  }

  public R_default_MM exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in24800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in24800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in24800 = _3;
    final L_A_Method lifted_17420000 = this._1;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_125300 = env_in24800;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_129700 = c_in24800;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_125300 = store_in24800;
      if(lifted_17420000 != null && lifted_17420000.equals(new NIL(this.getSourceInfo())))
      { 
        final com.github.krukow.clj_ds.PersistentMap<?, ?> lifted_17410000 = (com.github.krukow.clj_ds.PersistentMap<?, ?>)PersistentTreeMap.EMPTY;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_17390000 = (com.github.krukow.clj_ds.PersistentMap<String, A_Method>)lifted_17410000;
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24800 = store_125300;
        final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out24800 = lifted_17390000;
        return new R_default_MM(result_out24800, store_out24800);
      }
      else
      { 
        if(lifted_17420000 != null && !lifted_17420000.isEmpty())
        { 
          final A_Method m4100000 = lifted_17420000.head();
          final L_A_Method ms4800000 = lifted_17420000.tail();
          final Method_4 $tmp512 = m4100000.match(Method_4.class);
          if($tmp512 != null)
          { 
            final A_Type lifted_16880000 = $tmp512.get_1();
            final String name3500000 = $tmp512.get_2();
            final L_A_Param lifted_16890000 = $tmp512.get_3();
            final A_Block lifted_16900000 = $tmp512.get_4();
            final initMethods_1 lifted_17450000 = new initMethods_1(this.getSourceInfo(), ms4800000);
            final R_default_MM $tmp513 = lifted_17450000.exec_default(env_125300, c_129700, store_125300);
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_1834000 = $tmp513.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_218300 = $tmp513.get_1();
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> lifted_17430000 = MapUtils.plus(lifted_1834000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_Method>().plus(name3500000, m4100000));
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out24800 = store_218300;
            final com.github.krukow.clj_ds.PersistentMap<String, A_Method> result_out24800 = lifted_17430000;
            return new R_default_MM(result_out24800, store_out24800);
          }
          else
          { }
        }
        else
        { }
      }
    }
    { 
      return super.exec_default(_1, _2, _3);
    }
  }

  public L_A_Method get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("initMethods", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}