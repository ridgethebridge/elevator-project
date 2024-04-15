CA=compileall
prog=Main
RA=runall

pdf:
	pdflatex specs.tex

%.c: %.java
	 $(CA) $^

run: $(prog).class

	$(RA) $(prog) 

clean:
	del *.class 

