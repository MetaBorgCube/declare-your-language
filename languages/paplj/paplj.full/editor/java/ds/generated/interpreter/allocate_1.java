package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class allocate_1 extends A_allocate__Arrow 
{ 
  @Child public A_V _1;

  public allocate_1 (INodeSource source, A_V _1) 
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
    final allocate_1 other = (allocate_1)obj;
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

  public R_default_Int exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in26300 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in28500 = _2;
    final A_This this_in25600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in28500 = _4;
    final A_V v1190000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_127400 = l_string_class_in26300;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_128700 = l_string_v_in28500;
    final A_This this_126300 = this_in25600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_128900 = l_int_v_in28500;
    final int loc42100000 = ds.manual.interpreter.Natives.fresh();
    final write_2 lifted_45200000 = new write_2(this.getSourceInfo(), loc42100000, v1190000000);
    final R_default_V $tmp1103 = lifted_45200000.exec_default(l_string_class_127400, l_string_v_128700, this_126300, l_int_v_128900);
    final A_V lifted_43460000 = $tmp1103.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221600 = $tmp1103.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out28400 = l_int_v_221600;
    final int result_out56200 = loc42100000;
    return new R_default_Int(result_out56200, l_int_v_out28400);
  }

  public A_V get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("allocate", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}