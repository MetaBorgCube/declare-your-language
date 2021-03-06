package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_writeField__Arrow extends A_writeField__Arrow implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_writeField__Arrow (INodeSource source, IStrategoTerm term) 
  { 
    this.setSourceInfo(source);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize(1).match(clazz);
  }

  @Override public void specializeChildren(int depth)
  { 
    throw new InterpreterException("Operation not supported", "aterm specializer", this);
  }

  @Override public A_writeField__Arrow specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_writeField__Arrow)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("writeField") && term.getSubtermCount() == 4)
      { 
        A_writeField__Arrow replacement = replace(new writeField_4(source, new Generic_A_Obj(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), Tools.asJavaString(term.getSubterm(1)), Tools.asJavaString(term.getSubterm(2)), new Generic_A_V(NodeSource.fromStrategoTerm(term.getSubterm(3)), term.getSubterm(3))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    IGenericNode replacement = null;
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    return specialize(1).exec_default(_1, _2, _3);
  }
}