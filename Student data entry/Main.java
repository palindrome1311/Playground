#include <iostream>

#include<string>

struct student

{

char name[50];

int roll;

int marks;

};

int main()

{

struct student s1;

std::cout<<"\nStudent Details"<<"\n";

//  The   \n  before Student is very important or else no test case will pass

std::cin.getline(s1.name,50);

std::cin>>s1.roll; std::cin>>s1.marks;

std::cout<<"Name: "<<s1.name<<"\n"<<"Roll: "<<s1.roll<<"\n"<<"Marks: "<<s1.marks<<"\n";

}
