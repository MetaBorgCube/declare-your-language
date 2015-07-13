package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_Method extends A_Method implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Method (INodeSource source, IStrategoTerm term) 
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

  @Override public A_Method specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Method)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("Method") && term.getSubtermCount() == 4)
      { 
        A_Method replacement = replace(new Method_4(source, new Generic_A_Type(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), Tools.asJavaString(term.getSubterm(1)), new L_A_Param(NodeSource.fromStrategoTerm(term.getSubterm(2))).fromStrategoTerm(term.getSubterm(2)), new Generic_A_Block(NodeSource.fromStrategoTerm(term.getSubterm(3)), term.getSubterm(3))));
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