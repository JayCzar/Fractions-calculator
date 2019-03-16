#include <iostream>

using namespace std;

class Pet{
    string name;
    string type;
    int age;
public:
    setName(string n){
        name = n;
    }
    setType(string t){
        type = t;
    }
    setAge(int a){
        age = a;
    }
    string getname(){
        return name;
    }
    string getType(){
        return type;
    }
    int getAge(){
        return age;
    }
}object_p;

int main()
{
    object_p.setName("Sashi");
    object_p.setType("Dog");
    object_p.setAge(5);
    cout<<"My pet is named "<<object_p.getname()<< endl;
    cout<<"My pet is a "<<object_p.getType()<< endl;
    cout<<"My pet is aged "<<object_p.getAge()<< endl;
    return 0;
}
