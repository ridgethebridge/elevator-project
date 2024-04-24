
# just to practice makefiles

CA=compileall
prog=Main
RA=runall
JC=javac
J=java

pdf:
	pdflatex specs.tex

%.fx: %.java
	 $(CA) $^

%.c: %.java
	$(JC) $^

%.r: %.class
	$(J) $^


run: $(prog).class

	$(RA) $(prog) 

clean: 
	del *.class 

