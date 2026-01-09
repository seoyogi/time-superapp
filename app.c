#include <stdio.h>
#include <time.h>
int main() {
    time_t t;
    struct tm *tm_info;
    char buffer[9];
    while(1){
        t = time(NULL);
        tm_info = localtime(&t);
        strftime(buffer, 9, "%H:%M:%S", tm_info);
        printf("\r%s", buffer);
        fflush(stdout);
        sleep(1);
    }
    return 0;
}
