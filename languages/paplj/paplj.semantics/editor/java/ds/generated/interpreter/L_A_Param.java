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
      throw new InterpreterException("No such element exception");
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
      throw new InterpreterException("No such element exception");
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

  public R_default_List_String_ exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in430 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in430 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in430 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in430 = _4;
    final L_A_Param lifted_2010000 = this;
    { 
      final A_This this_14400 = this_in430;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_14300 = env_in430;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_14400 = c_in430;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_14300 = store_in430;
      if(lifted_2010000 != null && lifted_2010000.equals(new NIL(this.getSourceInfo())))
      { 
        final L_String lifted_2000000 = (L_String)new L_String(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out430 = store_14300;
        final L_String result_out430 = lifted_2000000;
        return new R_default_List_String_(result_out430, store_out430);
      }
      else
      { 
        if(lifted_2010000 != null && !lifted_2010000.isEmpty())
        { 
          final A_Param lifted_2030000 = lifted_2010000.head();
          final L_A_Param params700000 = lifted_2010000.tail();
          final Param_2 $tmp101 = lifted_2030000.match(Param_2.class);
          if($tmp101 != null)
          { 
            final A_Type lifted_230000 = $tmp101.get_1();
            final String x2300000 = $tmp101.get_2();
            final R_default_List_String_ $tmp102 = params700000.exec_default(this_14400, env_14300, c_14400, store_14300);
            final L_String xs700000 = $tmp102.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_23200 = $tmp102.get_1();
            final L_String lifted_2020000 = new L_String(this.getSourceInfo(), x2300000, xs700000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out430 = store_23200;
            final L_String result_out430 = lifted_2020000;
            return new R_default_List_String_(result_out430, store_out430);
          }
          else
          { }
        }
        else
        { }
      }
    }
    { 
      throw new InterpreterException("Rule failure");
    }
  }
}