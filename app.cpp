#include <iostream>
#include <chrono>
#include <thread>
#include <ctime>
using namespace std;
int main() {
    while(true){
        auto now = chrono::system_clock::to_time_t(chrono::system_clock::now());
        cout << "\r" << ctime(&now);
        this_thread::sleep_for(chrono::seconds(1));
    }
}
