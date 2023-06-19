.MODEL SMALL
.STACK 100H
.DATA
MSG DB 'ENTER THE INPUT: ','$'
PRIME DB 10,13,'PRIME NUMBER','$'
NOT_PRIME DB 10,13,'NOT PRIME NUMBER$'
N DB ?
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    MOV AH,9
    LEA DX,MSG
    INT 21H
    
    MOV AH,1
    INT 21H
    
    MOV CL,2
    SUB AL,48 
    MOV N,AL
    
  
    CMP N,1
    JE IS_PRIME
    
    CMP N,2
    JE IS_PRIME
    
    CMP N,3
    JE IS_PRIME
    
    CMP N,5
    JE IS_PRIME
    
    CMP N,7
    JE IS_PRIME
    
   
    
   
    JMP IS_NOT_PRIME
    
   
    
  IS_PRIME:
    MOV AH,9
    LEA DX,PRIME
    INT 21H
    JMP EXIT
    
  IS_NOT_PRIME:
    MOV AH,9
    LEA DX,NOT_PRIME
    INT 21H
    
  EXIT:
    MOV AH,4CH
    INT 21H
    
    MAIN ENDP

END MAIN
    
    