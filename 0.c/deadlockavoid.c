#include <stdio.h>
#define MAX_PROCESSES 10
#define MAX_RESOURCES 10

int allocation[MAX_PROCESSES][MAX_RESOURCES];
int request[MAX_PROCESSES][MAX_RESOURCES];
int available[MAX_RESOURCES];
int marked[MAX_PROCESSES];
int n, m; // Number of processes and resources

void input() {
    printf("Enter the number of processes: ");
    scanf("%d", &n);

    printf("Enter the number of resources: ");
    scanf("%d", &m);

    printf("Enter the allocated resources for each process (one row per process):\n");
    for (int i = 0; i < n; i++) {
        printf("Process %d: ", i + 1);
        for (int j = 0; j < m; j++) {
            scanf("%d", &allocation[i][j]);
        }
    }

    printf("Enter the resource requests for each process (one row per process):\n");
    for (int i = 0; i < n; i++) {
        printf("Process %d: ", i + 1);
        for (int j = 0; j < m; j++) {
            scanf("%d", &request[i][j]);
        }
    }

    printf("Enter the available resources (separated by spaces): ");
    for (int i = 0; i < m; i++) {
        scanf("%d", &available[i]);
    }
}

void initMarked() {
    for (int i = 0; i < n; i++) {
        marked[i] = 0;
    }
}

int isMarked(int process) {
    return marked[process] == 1;
}

void markProcess(int process) {
    marked[process] = 1;
}

void detectDeadlock() {
    int work[MAX_RESOURCES];
    int finish[MAX_PROCESSES];
    int i, j;

    for (i = 0; i < m; i++) {
        work[i] = available[i];
    }

    for (i = 0; i < n; i++) {
        finish[i] = 0;
    }

    int count = 0;
    while (count < n) {
        int found = 0;

        for (i = 0; i < n; i++) {
            if (finish[i] == 0) {
                int canExecute = 1;

                for (j = 0; j < m; j++) {
                    if (request[i][j] > work[j]) {
                        canExecute = 0;
                        break;
                    }
                }

                if (canExecute) {
                    finish[i] = 1;
                    found = 1;
                    count++;
                    markProcess(i);

                    for (j = 0; j < m; j++) {
                        work[j] += allocation[i][j];
                    }

                    break;
                }
            }
        }

        if (!found) {
            break;
        }
    }

    printf("Marked processes (deadlocked processes): ");
    for (i = 0; i < n; i++) {
        if (isMarked(i)) {
            printf("%d ", i + 1);
        }
    }
    printf("\n");
}

int main() {
    input();
    initMarked();
    detectDeadlock();

    return 0;
}





