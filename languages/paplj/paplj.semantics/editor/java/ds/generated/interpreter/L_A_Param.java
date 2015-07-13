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

  public R_default_List_String_ exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in2680 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in2680 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in2680 = _3;
    final L_A_Param lifted_18030000 = this;
    { 
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_127300 = env_in2680;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_132200 = c_in2680;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127300 = store_in2680;
      if(lifted_18030000 != null && lifted_18030000.equals(new NIL(this.getSourceInfo())))
      { 
        final L_String lifted_18020000 = (L_String)new L_String(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2680 = store_127300;
        final L_String result_out2680 = lifted_18020000;
        return new R_default_List_String_(result_out2680, store_out2680);
      }
      else
      { 
        if(lifted_18030000 != null && !lifted_18030000.isEmpty())
        { 
          final A_Param lifted_18050000 = lifted_18030000.head();
          final L_A_Param params1600000 = lifted_18030000.tail();
          final Param_2 $tmp539 = lifted_18050000.match(Param_2.class);
          if($tmp539 != null)
          { 
            final A_Type lifted_16970000 = $tmp539.get_1();
            final String x39300000 = $tmp539.get_2();
            final R_default_List_String_ $tmp540 = params1600000.exec_default(env_127300, c_132200, store_127300);
            final L_String xs2400000 = $tmp540.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219400 = $tmp540.get_1();
            final L_String lifted_18040000 = new L_String(this.getSourceInfo(), x39300000, xs2400000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out2680 = store_219400;
            final L_String result_out2680 = lifted_18040000;
            return new R_default_List_String_(result_out2680, store_out2680);
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