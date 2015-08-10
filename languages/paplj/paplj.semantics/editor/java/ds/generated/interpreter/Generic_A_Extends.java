package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_Extends extends A_Extends implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Extends (INodeSource source, IStrategoTerm term) 
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

  @Override public A_Extends specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Extends)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("NoExtends") && term.getSubtermCount() == 0)
      { 
        A_Extends replacement = replace(new NoExtends_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("Extends") && term.getSubtermCount() == 1)
      { 
        A_Extends replacement = replace(new Extends_1(source, Tools.asJavaString(term.getSubterm(0))));
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
}