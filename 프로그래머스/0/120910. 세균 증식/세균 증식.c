#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int t) {

    int result = 1; 
    for (int i = 1; i <= t; i++) {
        
        result *= 2;
    }
    
    
    return result * n;
}