Thanks

# Validation

> First, the theory has not yet been connected fully to any implementation of a meta-level tool or any full-scale object language.

We certainly agree that this is an initial design that may require validation and refinement. Our previous experiments with applying NaBL give us some confidence in the design of the framework in the paper. But we will indeed need to validate the theory through a re-implementation of NaBL based on the resolution calculus in this paper.

# Encoding & Scope

> To improve the paper, it would be better to clarify upfront that the model is mostly aimed at describing a broad range of lexically-scoped languages

We will clarify the range of languages that we aspire to model.

> On page 4, you write that the binding pattern of classic lambdas is simple, 

Rather than characterising classic lambdas as ‘simple, we observe that ‘the scope of the bound variable is the subtree dominated by the binding construct’, i.e. the scope is contiguous. 

> However, isn't it easy to represent "let" with nodes like Let(x1, value1, Let(x2, value2, body))

Yes, it is possible to encode such binding patterns by means of a transformation on the AST. However, as Cheney (MERLIN 2005) notes, such encodings are always _inconvenient_, since all further operations work on the encoded AST, and may be _inadequate_, since it leads to ‘confusion’ and ‘junk’. Our aim is to provide a theory of name resolution that can directly express such patterns and thus provide an adequate explanation of name binding rules.

> The reason is that there is a limitation baked in the definition of scope graphs (Fig 1), which assumes only one parent. Why insist on this restriction? In particular, it forces the treatment of inheritance to be quite simplistic, ignoring multiple inheritance.

The key assumption in the calculus regarding the parent relation is that it is acyclic. Currently we assume it to be functional, to model the common case of a single lexical environment. The parent relation can be generalized to an arbitrary acyclic relation, without losing the well-foundedness of the calculus. 

However, we model inheritance by means of imports; on page 16 ’We import declarations from the corresponding named scope transitively into class bodies.’ We may have to improve the explanation of that example if this is not clear. Furthermore, we should point out that multiple inheritance is naturally expressed as a class with multiple imports, just as a regular module can import multiple other models. 

> The discussion of inheritance also misses super and field shadowing, which seem relevant to assess the applicability of the calculus in this context.

field shadowing is covered by import specificity 

A ’super’ method is an implicit declaration in a class that aliases the constructor of the super class.

# Variation

> this is a fairly "opinionated" design, in that sense that one particular regime of binding, imports, etc. is hardcoded into the formalism.

While the lexical scoping regime is indeed hardcoded into the formalism, some parameterization is also introduced through the well-formedness predicate and specificity ordering on paths. 

These parameters allows to tune the formalism to represent different policies (e.g. transitive or non transitive imports)

> Do you imagine a future NaBL exposing a way to tweak the definitions of the well-formed-path and path-specifity relations, in the style you demonstrate in the paper to shape the semantics of name resolution?

Yes, this model is supposed to be a step towards a new NaBL that will not only encode the generation of the scope graph from the AST but also allow to parametrize the resolution through the well-formedness and path ordering predicates.

Or perhaps including more variation in the framework by means of flags on, for example, import to 





