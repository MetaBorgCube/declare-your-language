package ds.generated.interpreter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.spoofax.interpreter.terms.*;
import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.interpreter.framework.*;
import com.github.krukow.clj_ds.PersistentMap;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class AutoMapUtils  
{ 
  public static IStrategoTerm map_String_int2aterm(PersistentMap<String, Integer> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    int idx = 0;
    for(Entry<String, Integer> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, TermUtils.termFromString(entry.getKey(), factory), TermUtils.termFromInt(entry.getValue(), factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static com.github.krukow.clj_ds.PersistentMap<String, Integer> aterm2map_String_int(IStrategoTerm term)
  { 
    final Map<String, Integer> result = new TreeMap<String, Integer>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        for(int idx = 1; idx < term.getSubtermCount(); idx++)
        { 
          IStrategoTerm kid = term.getSubterm(idx);
          if(Tools.isTermAppl(kid))
          { 
            IStrategoAppl bindAppl = (IStrategoAppl)kid;
            if(Tools.hasConstructor(bindAppl, "Bind", 2))
            { 
              result.put(TermUtils.stringFromTerm(bindAppl.getSubterm(0)), TermUtils.intFromTerm(bindAppl.getSubterm(1)));
            }
          }
        }
        return PersistentTreeMap.create(result);
      }
    }
    throw new RewritingException("Malformed map");
  }

  public static IStrategoTerm map_String_A_Method2aterm(PersistentMap<String, A_Method> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    int idx = 0;
    for(Entry<String, A_Method> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, TermUtils.termFromString(entry.getKey(), factory), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static com.github.krukow.clj_ds.PersistentMap<String, A_Method> aterm2map_String_A_Method(IStrategoTerm term)
  { 
    final Map<String, A_Method> result = new TreeMap<String, A_Method>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        for(int idx = 1; idx < term.getSubtermCount(); idx++)
        { 
          IStrategoTerm kid = term.getSubterm(idx);
          if(Tools.isTermAppl(kid))
          { 
            IStrategoAppl bindAppl = (IStrategoAppl)kid;
            if(Tools.hasConstructor(bindAppl, "Bind", 2))
            { 
              result.put(TermUtils.stringFromTerm(bindAppl.getSubterm(0)), new Generic_A_Method(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)).specialize(1));
            }
          }
        }
        return PersistentTreeMap.create(result);
      }
    }
    throw new RewritingException("Malformed map");
  }

  public static IStrategoTerm map_String_A_Class2aterm(PersistentMap<String, A_Class> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    int idx = 0;
    for(Entry<String, A_Class> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, TermUtils.termFromString(entry.getKey(), factory), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static com.github.krukow.clj_ds.PersistentMap<String, A_Class> aterm2map_String_A_Class(IStrategoTerm term)
  { 
    final Map<String, A_Class> result = new TreeMap<String, A_Class>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        for(int idx = 1; idx < term.getSubtermCount(); idx++)
        { 
          IStrategoTerm kid = term.getSubterm(idx);
          if(Tools.isTermAppl(kid))
          { 
            IStrategoAppl bindAppl = (IStrategoAppl)kid;
            if(Tools.hasConstructor(bindAppl, "Bind", 2))
            { 
              result.put(TermUtils.stringFromTerm(bindAppl.getSubterm(0)), new Generic_A_Class(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)).specialize(1));
            }
          }
        }
        return PersistentTreeMap.create(result);
      }
    }
    throw new RewritingException("Malformed map");
  }

  public static IStrategoTerm map_String_A_V2aterm(PersistentMap<String, A_V> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    int idx = 0;
    for(Entry<String, A_V> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, TermUtils.termFromString(entry.getKey(), factory), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static com.github.krukow.clj_ds.PersistentMap<String, A_V> aterm2map_String_A_V(IStrategoTerm term)
  { 
    final Map<String, A_V> result = new TreeMap<String, A_V>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        for(int idx = 1; idx < term.getSubtermCount(); idx++)
        { 
          IStrategoTerm kid = term.getSubterm(idx);
          if(Tools.isTermAppl(kid))
          { 
            IStrategoAppl bindAppl = (IStrategoAppl)kid;
            if(Tools.hasConstructor(bindAppl, "Bind", 2))
            { 
              result.put(TermUtils.stringFromTerm(bindAppl.getSubterm(0)), new Generic_A_V(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)).specialize(1));
            }
          }
        }
        return PersistentTreeMap.create(result);
      }
    }
    throw new RewritingException("Malformed map");
  }

  public static IStrategoTerm map_int_A_V2aterm(PersistentMap<Integer, A_V> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    int idx = 0;
    for(Entry<Integer, A_V> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, TermUtils.termFromInt(entry.getKey(), factory), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static com.github.krukow.clj_ds.PersistentMap<Integer, A_V> aterm2map_int_A_V(IStrategoTerm term)
  { 
    final Map<Integer, A_V> result = new TreeMap<Integer, A_V>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        for(int idx = 1; idx < term.getSubtermCount(); idx++)
        { 
          IStrategoTerm kid = term.getSubterm(idx);
          if(Tools.isTermAppl(kid))
          { 
            IStrategoAppl bindAppl = (IStrategoAppl)kid;
            if(Tools.hasConstructor(bindAppl, "Bind", 2))
            { 
              result.put(TermUtils.intFromTerm(bindAppl.getSubterm(0)), new Generic_A_V(NodeSource.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)).specialize(1));
            }
          }
        }
        return PersistentTreeMap.create(result);
      }
    }
    throw new RewritingException("Malformed map");
  }
}