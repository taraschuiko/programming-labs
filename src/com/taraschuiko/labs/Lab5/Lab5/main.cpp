#include <iostream>

using namespace std;

struct ZNAK {
    string firstName;
    string lastName;
    string zodiac;
    int birthDate [3];
};

void inputArray(ZNAK *array, int size);

void getInfo(ZNAK *array);

int main() {
    int size = 8;
    ZNAK array[size];
    inputArray(array, size);
    getInfo(array);
    
    return 0;
}

void inputArray(ZNAK *array, int size) {
    for (int i = 0; i < size; i++) {
        cout << "Person " << i << endl;
        cout << "Input first name: ";
        cin >> array[i].firstName;
        cout << "Input last name: ";
        cin >> array[i].lastName;
        cout << "Input zodiac sign: ";
        cin >> array[i].zodiac;
        cout << "Input birth day: ";
        cin >> array[i].birthDate[0];
        cout << "Input birth month: ";
        cin >> array[i].birthDate[1];
        cout << "Input birth year: ";
        cin >> array[i].birthDate[2];
    }
}

void getInfo(ZNAK *array) {
    string lastName;
    cout << "Input a last name to get info: ";
    cin >> lastName;
    
    bool lastNameFound = false;
    for (int i = 0; i < 8; i++) {
        if (lastName == array[i].lastName) {
            cout << array[i].firstName << endl;
            cout << array[i].lastName << endl;
            cout << array[i].zodiac << endl;
            cout << array[i].birthDate[0];
            cout << "/";
            cout << array[i].birthDate[1];
            cout << "/";
            cout << array[i].birthDate[2];
            
            lastNameFound = true;
            break;
            }
    }
    if (!lastNameFound) {
        cout << "This person was not found";
    }
}
