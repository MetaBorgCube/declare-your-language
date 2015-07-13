package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_This extends A_This implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_This (INodeSource source, IStrategoTerm term) 
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

  @Override public A_This specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_This)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
    }
    IGenericNode replacement = null;
    try
    { 
      if(replacement != null)
      { 
        replacement.replace(this);
      }
      replacement = new Generic_A_Obj(getSourceInfo(), aterm);
      return replace(new T_1(getSourceInfo(), (A_Obj)replacement.specialize(1)));
    }
    catch(RewritingException v_101533)
    { }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}