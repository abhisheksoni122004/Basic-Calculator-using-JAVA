// #include<iostream>
// using namespace std;
// int main(){
//     int n,m;
//      cout<<"Enter Row and Column One By One : "<<endl;
//     cin>>n;
//     cin>>m;
   
//     for(int i= 1 ; i<=n ; i++){
//         for(int j= 1; j<=m ; j++){
//     }cout<<"*";
// }cout<<endl;


// return 0;
// }

#include<iostream>
#include<cstring>
using namespace std;
class city
{
    protected:
    char*name;
    int len;
    public:
    city()
    {
        len=0;
        name=new char[len+1];
    }
    void getname(void)
    {
        char*s;
        s=new char[30];

        cout<<"Enter your  city : ";
        cin>>s;
        len=strlen(s);
        name=new char[len+1];
        strcpy(name,s);
    }
    void printname(void)
    {
        cout<<name<<endl;
    }
};

int main()
{
    city*cptr[10];

    int n=1;
    int option;
    do{
        cptr[n] = new city;
        cptr[n]->getname();
        n++;
        cout<<"Do you want to Enter one more Name ? " <<endl;
        cout<<"(enter 1 for Yes 0 for No ) : ";
        cin>>option;
    }
    while(option);
    cout<<"\n\n";
    for(int i=1; i<=n; i++)
    {
        cptr[i]->printname();
    }
    return 0;

}