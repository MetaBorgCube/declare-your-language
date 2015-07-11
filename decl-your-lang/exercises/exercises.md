# Declare Your Language in Spoofax / Exercises

## Installation Instructions

Spoofax

The PAPLJ project


building the project


## 1. Syntax

* Open projects paplj.syntax, paplj.syntax.exercises

* Build the paplj.syntax project

* Open a test-suite in the exercises project
	* Run the `Run testsuites` entry in the `Transform` menu

* Add productions to make the exercise tests succeed
	* syntax/Expressions.sdf3 
	* syntax/Classes.sdf3

* Use the doodle.pj file to try out different programs, or make your own

* Try out the `Syntax` menu
	* Format
	* Show Abstract Syntax
	* How do ‘Builders’ work?

* Close project paplj.syntax

## 2. Transformation

* Open paplj.transformation, paplj.transformation.exercises

* Inspect the solution for the syntax exercises

* Add rewrite rules to make the exercise tests succeed
	* trans/desugar/desugar-rules.str
	* trans/desugar/resugar-rules.str

* Use the doodle.pj file to try out different programs, or make your own

* Try out the `Transform` menu
	* Desugar
	* Desugar AST

* Close project paplj.transformation

## 3. Name and Type Analysis

* Open projects paplj.analysis, paplj.analysis.exercises

* Inspect the solution for the transformation exercises

* Add name binding rules to make the exercise tests succeed
	* trans/check/names.nab

* Add type rules to make the exercise tests succeed 
	* trans/check/types.ts

* Close project paplj.analysis

## 4. Dynamic Semantics

* Open projects paplj.semantics, paplj.semantics.exercises

* Inspect the solution for the analysis exercises

* Add reduction rules to make the exercise tests succeed
	* trans/semantics/interp.ds

* To build, first generate Java code from DynSem
	* Use `All to Java` entry in `Semantics` menu for `trans/semantics/semantics.ds`

* Close project paplj.semantics

## 5. Full Definition

The project paplj.full contains the full definition of the dynamic semantics
