package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class L_A_Param  implements INodeList
{ 
  public INodeSource source;

  public L_A_Param (INodeSource source) 
  { 
    this(source, null, null);
  }

  public L_A_Param (INodeSource source, A_Param head, L_A_Param tail) 
  { 
    this.source = source;
    this.head = head;
    this.tail = tail;
    this.size = (head == null ? 0 : 1) + (tail == null ? 0 : tail.size());
  }

  @Child public A_Param head;

  @Children public L_A_Param tail;

  public final int size;

  @Override public void setSourceInfo(INodeSource source)
  { 
    this.source = source;
  }

  @Override public INodeSource getSourceInfo()
  { 
    return source;
  }

  @Override public A_Param head()
  { 
    if(head == null)
    { 
      throw new InterpreterException("No such element exception", null, this);
    }
    return head;
  }

  @Override public void replaceHead(Object newHead)
  { 
    this.head = (A_Param)newHead;
  }

  @Override public L_A_Param tail()
  { 
    if(tail == null)
    { 
      throw new InterpreterException("No such element exception", null, this);
    }
    return tail;
  }

  @Override public int size()
  { 
    return size;
  }

  @Override public boolean isEmpty()
  { 
    return head == null;
  }

  @Override public int hashCode()
  { 
    return ListUtils.hashCode(this);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return ListUtils.toStrategoTerm(this, factory);
  }

  @Override public boolean equals(Object obj)
  { 
    return ListUtils.equals(this, obj);
  }

  @Override public String toString()
  { 
    return ListUtils.toString(this);
  }

  private boolean hasSpecialized;

  public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      if(head instanceof IGenericNode)
      { 
        ((IGenericNode)head).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  @Override public L_A_Param fromStrategoTerm(IStrategoTerm alist)
  { 
    L_A_Param list = new L_A_Param(NodeSource.fromStrategoTerm(alist));
    for(int l = alist.getSubtermCount() - 1; l >= 0; l--)
    { 
      final INodeSource source = NodeSource.fromStrategoTerm(alist.getSubterm(l));
      list = new L_A_Param(NodeSource.fromStrategoTerm(alist), new Generic_A_Param(source, alist.getSubterm(l)), list);
    }
    return list;
  }

  public R_default_List_String_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_in2670 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_in2890 = _2;
    final A_This this_in2610 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_in2890 = _4;
    final L_A_Param lifted_45320000 = this;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> l_string_class_128000 = l_string_class_in2670;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_129300 = l_string_v_in2890;
      final A_This this_126900 = this_in2610;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_129300 = l_int_v_in2890;
      if(lifted_45320000 != null && lifted_45320000.equals(new NIL(this.getSourceInfo())))
      { 
        final L_String lifted_45310000 = (L_String)new L_String(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out2880 = l_int_v_129300;
        final L_String result_out5660 = lifted_45310000;
        return new R_default_List_String_(result_out5660, l_int_v_out2880);
      }
      else
      { 
        if(lifted_45320000 != null && !lifted_45320000.isEmpty())
        { 
          final A_Param lifted_45340000 = lifted_45320000.head();
          final L_A_Param params186000000 = lifted_45320000.tail();
          final Param_2 $tmp1106 = lifted_45340000.match(Param_2.class);
          if($tmp1106 != null)
          { 
            final A_Type lifted_43470000 = $tmp1106.get_1();
            final String x597000000 = $tmp1106.get_2();
            final R_default_List_String_ $tmp1107 = params186000000.exec_default(l_string_class_128000, l_string_v_129300, this_126900, l_int_v_129300);
            final L_String xs188000000 = $tmp1107.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_221800 = $tmp1107.get_1();
            final L_String lifted_45330000 = new L_String(this.getSourceInfo(), x597000000, xs188000000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> l_int_v_out2880 = l_int_v_221800;
            final L_String result_out5660 = lifted_45330000;
            return new R_default_List_String_(result_out5660, l_int_v_out2880);
          }
          else
          { }
        }
        else
        { }
      }
    }
    { 
      throw new InterpreterException("Rule failure", "default", this);
    }
  }
}