;HERE DO NOT HAVE PROPER LOGIC FOR FACTORIAL 1
include 'emu8086.inc'
.MODEL SMALL
.STACK 100H

.DATA

NUMBER DB 0
NEWLINE DB 0AH,0DH,'$'
A DB ? 
MSG1 db 10,13
.CODE 
MAIN PROC
     MOV DX,@DATA
     MOV DS,DX
     
     
     PRINT "Enter digit (0 to 3): "
     
     MOV AH,1
     INT 21H 
     
     
     
     SUB AL,'0' 
     
      CMP AL, 1
     JE  PRINT
      
      
    ;WRONG INPUT
     CMP AL, 3
     JG  EXIT
         
         
      
     MOV A,AL 
     
  
  
   FACTORIAL_2_3:
     CMP A, '0'
     JE EXIT
     
     MOV AX,1 
     MUL A
     DEC A
     MUL A 
    JMP OUTPUT
     
   
      
    L2: 
     MOV AH, 2
     INT 21H 
     
     MOV AH,4CH
     INT 21H
     
   OUTPUT: 
    
   PRINT "Factorial value: "
   
     MOV DX, AX
     ADD DX, '0'
     CMP DX, '0'
     JG L2
       
     
    PRINT:
    PRINT "Factorial value: "
     
    PRINT "1" 
    
    MOV AH,4CH
    INT 21H 
     
      
        
   EXIT:  
      
     MOV AH,4CH
     INT 21H
    
    
    
    MAIN ENDP



END MAIN