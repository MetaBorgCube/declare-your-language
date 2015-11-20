package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;
import java.util.Objects;

@SuppressWarnings("unused") public class Generic_A_V extends A_V implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_V (INodeSource source, IStrategoTerm term) 
  { 
    Objects.requireNonNull(term);
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

  @Override public A_V specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_V)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("NumV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new NumV_1(source, TermUtils.intFromTerm(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("BoolV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new BoolV_1(source, TermUtils.boolFromTerm(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("NullV") && term.getSubtermCount() == 0)
      { 
        A_V replacement = replace(new NullV_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("ExceptionV") && term.getSubtermCount() == 0)
      { 
        A_V replacement = replace(new ExceptionV_0(source));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("o2v") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new o2v_1(source, new Generic_A_Obj(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)).specialize(1)));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
      if(name.equals("u2v") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new u2v_1(source, new Generic_A_Unit(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)).specialize(1)));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    try
    { 
      return replace(new o2v_1(getSourceInfo(), new Generic_A_Obj(NodeSource.fromStrategoTerm(aterm), aterm).specialize(1)));
    }
    catch(RewritingException k_353500)
    { 
      try
      { 
        return replace(new u2v_1(getSourceInfo(), new Generic_A_Unit(NodeSource.fromStrategoTerm(aterm), aterm).specialize(1)));
      }
      catch(RewritingException j_353500)
      { }
    }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}