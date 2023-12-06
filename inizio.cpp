#include <iostream>
using namespace std;

struct persona
{
    string nome;
    string cognome;
    int eta;
};



int main()
{
    persona p;
    p.nome = "Mario";
    p.cognome = "Rossi";
    p.eta = 20;

    cout << "Nome: " << p.nome << endl;
    cout << "Cognome: " << p.cognome << endl;
    cout << "Eta: " << p.eta << endl;
}