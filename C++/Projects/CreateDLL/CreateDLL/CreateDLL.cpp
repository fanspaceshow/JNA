//#include<iostream>
using namespace std;

extern "C"  __declspec(dllexport)   int Add(int a, int b);
extern "C"  __declspec(dllexport)   int substract(int a, int b);
extern "C"  __declspec(dllexport)   char* printHello();
//整数加法
int Add(int a, int b){
	return a + b;
}
int substract(int a, int b) {
	return a - b;
}
char* printHello() {
	return "Hello,JNA";
}