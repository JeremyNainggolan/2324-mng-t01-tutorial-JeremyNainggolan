compile :
	javac model/*.java driver/*.java -d bin

test_01 :
	cd bin && java driver.Driver