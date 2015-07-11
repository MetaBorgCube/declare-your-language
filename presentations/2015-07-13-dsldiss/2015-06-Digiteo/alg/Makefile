
all:
	pdflatex document.tex
	bibtex document

bib:
	curl -o bibliography.bib http://researchr.org/downloadbibtex/bibliography/ldwb-rescalc
	curl -o bibliography-compact.bib http://researchr.org/downloadbibtex/bibliography/ldwb-rescalc/compact

clean:
	rm -f document.bbl document.blg document.log document.aux document.out 
