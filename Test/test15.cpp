#include<iostream>
#include<fstream>
#include<iomanip>
#include<stdlib.h>
using namespace std;
class student {
    int roll.no;
    char name[];
    int p_marks , c_marks , m_marks , e_marks , cs_marks ;
    double per;
    char grade;
    void calculate();
    public:
    void getdata();
    void showdata() const;
    void showt_tabular const;
    int retrollno() const;  
};

void student::calculate(){
    per=(p_marks+c_marks+m_marks+e_marks+cs_marks)/5.0;
    if (per>=60)
    grade="A";
    else if(per>=50)
    grade="B";
    else if(per>=33)
    grade="C";
    else 
     grade="F";
}
void student::getdata(){
    cout<<"\nEnter the Roll.no  of student ";
    cin>>rollno;
    cout<<"\nEnter the Name of student ";
    cin.ignore();
    cin>>getline(name,50);
    cout<<"\nEnter The marks in physics out of 100 : ";
    cin>>p_marks;
    cout<<"\nEnter The marks in Chemistry out of 100 : ";
    cin>>c_marks;
    cout<<"\nEnter The marks in Maths out of 100 : ";
    cin>>m_marks;
    cout<<"\nEnter The marks in English out of 100 : ";
    cin>>e_marks;
    cout<<"\nEnter The marks in Computer science out of 100 : ";
    cin>>cp_marks;
    calculate();
}
void student::showdata(){
    cout<<"\nRoll Number of Student : "<<rollno;
    cout<<"\nName of student : "<<name;
    cout<<"\nMarks of physics :"<<p_marks;
    cout<<"\nMarks of Maths : "<<m_marks;
    cout<<"\nMarks of Chemistry : "<<c_marks;
    cout<<"\nMarks of English : "<<e_marks;
    cout<<"\nMarks of Computer science : "<<cs_marks;
    cout<<"\npercentage of Student is :"<<per;
    cout<<"\nGrade of student :"<<grade;
}
 void student::show_tabular() const
 {
    cout<<rollno<<setw(6)<<" "<<name<<setw(10)<<p_marks<<setw(4)<<c_marks<<setw(4)<<m_marks<<setw(4)
		<<e_marks<<setw(4)<<cs_marks<<setw(8)<<per<<setw(6)<<grade<<endl;
 }

 int student::retrollno() const
{
    return 0;   
}

void write_student();
void display_all();
void display_sp(int);
void modify_student(int);
void delete_student(int);
void class_result();
void result();
void intro();
void entry_menu();

int main()
{
    cahr ch;
    cout.setf(ios::fixed|ios::showpoint);
    cout<<setprecision(2);
    intro();
    do
    {
        system("cls");
        cout<<"\n\n\n\tMAIN MENU";
        cout<<"\n\n\t01. RESULT MENU";
        cout<<"\n\n\t"
    }
}
