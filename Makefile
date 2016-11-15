all:
	mkdir bin
	mkdir bin/src
	javac -cp antlr-4.5-complete.jar \
    */*.java \
	-d bin
	cp ./src/lib.s ./bin
	cp ./src/lib.s ./bin/src
clean:
	rm -rf bin
