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

  public R_default_List_String_ exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in2360 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3170 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3170 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3170 = _4;
    final L_A_Param lifted_20630000 = this;
    { 
      final A_This this_124700 = this_in2360;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_132300 = env_in3170;
      final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_138500 = c_in3170;
      final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_132300 = store_in3170;
      if(lifted_20630000 != null && lifted_20630000.equals(new NIL(this.getSourceInfo())))
      { 
        final L_String lifted_20620000 = (L_String)new L_String(this.getSourceInfo());
        final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3170 = store_132300;
        final L_String result_out3170 = lifted_20620000;
        return new R_default_List_String_(result_out3170, store_out3170);
      }
      else
      { 
        if(lifted_20630000 != null && !lifted_20630000.isEmpty())
        { 
          final A_Param lifted_20650000 = lifted_20630000.head();
          final L_A_Param params2300000 = lifted_20630000.tail();
          final Param_2 $tmp642 = lifted_20650000.match(Param_2.class);
          if($tmp642 != null)
          { 
            final A_Type lifted_18660000 = $tmp642.get_1();
            final String x51600000 = $tmp642.get_2();
            final R_default_List_String_ $tmp643 = params2300000.exec_default(this_124700, env_132300, c_138500, store_132300);
            final L_String xs3100000 = $tmp643.value;
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_223200 = $tmp643.get_1();
            final L_String lifted_20640000 = new L_String(this.getSourceInfo(), x51600000, xs3100000);
            final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3170 = store_223200;
            final L_String result_out3170 = lifted_20640000;
            return new R_default_List_String_(result_out3170, store_out3170);
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