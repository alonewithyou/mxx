main:
sub $sp, $sp, 252
li $t0, 4
li $t1, 5
mul $t0, $t0, $t1
sw $t0, 248($sp)
lw $t0, 248($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 248($sp)
lw $a0, 248($sp)
li $v0, 9
syscall
sw $v0, 244($sp)
lw $t1, 244($sp)
add $t1, 0
li $t0, 5
sw $t0, 0($t1)
lw $t0, 244($sp)
sw $t0, 240($sp)
li $t0, 1
sw $t0, 236($sp)
b label0
label0:
lw $t0, 236($sp)
li $t1, 3
sle $t0, $t0, $t1
sw $t0, 232($sp)
lw $t0, 232($sp)
bne $t0, $zero, label1
beq $t0, $zero, label2
label1:
li $t0, 4
lw $t1, 236($sp)
mul $t0, $t0, $t1
sw $t0, 228($sp)
lw $t0, 228($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 228($sp)
lw $t0, 240($sp)
lw $t1, 228($sp)
add $t0, $t0, $t1
sw $t0, 224($sp)
li $t0, 4
li $t1, 5
mul $t0, $t0, $t1
sw $t0, 220($sp)
lw $t0, 220($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 220($sp)
lw $a0, 220($sp)
li $v0, 9
syscall
sw $v0, 216($sp)
lw $t1, 216($sp)
add $t1, 0
li $t0, 5
sw $t0, 0($t1)
lw $t1, 224($sp)
add $t1, 0
lw $t0, 216($sp)
sw $t0, 0($t1)
li $t0, 1
sw $t0, 212($sp)
b label3
label3:
lw $t0, 212($sp)
li $t1, 3
sle $t0, $t0, $t1
sw $t0, 208($sp)
lw $t0, 208($sp)
bne $t0, $zero, label4
beq $t0, $zero, label5
label4:
li $t0, 4
lw $t1, 236($sp)
mul $t0, $t0, $t1
sw $t0, 204($sp)
lw $t0, 204($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 204($sp)
lw $t0, 240($sp)
lw $t1, 204($sp)
add $t0, $t0, $t1
sw $t0, 200($sp)
lw $t1, 200($sp)
lw $t0, 0($t1)
sw $t0, 196($sp)
li $t0, 4
lw $t1, 212($sp)
mul $t0, $t0, $t1
sw $t0, 192($sp)
lw $t0, 192($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 192($sp)
lw $t0, 196($sp)
lw $t1, 192($sp)
add $t0, $t0, $t1
sw $t0, 188($sp)
lw $t0, 236($sp)
lw $t1, 212($sp)
add $t0, $t0, $t1
sw $t0, 184($sp)
lw $t1, 188($sp)
add $t1, 0
lw $t0, 184($sp)
sw $t0, 0($t1)
lw $t0, 212($sp)
li $t1, 1
add $t0, $t0, $t1
sw $t0, 212($sp)
b label3
label5:
lw $t0, 236($sp)
li $t1, 1
add $t0, $t0, $t1
sw $t0, 236($sp)
b label0
label2:
li $t0, 0
sw $t0, 180($sp)
li $t0, 4
li $t1, 2
mul $t0, $t0, $t1
sw $t0, 176($sp)
lw $t0, 176($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 176($sp)
lw $t0, 240($sp)
lw $t1, 176($sp)
add $t0, $t0, $t1
sw $t0, 172($sp)
lw $t1, 172($sp)
lw $t0, 0($t1)
sw $t0, 168($sp)
li $t0, 4
li $t1, 2
mul $t0, $t0, $t1
sw $t0, 164($sp)
lw $t0, 164($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 164($sp)
lw $t0, 168($sp)
lw $t1, 164($sp)
add $t0, $t0, $t1
sw $t0, 160($sp)
lw $t1, 160($sp)
lw $t0, 0($t1)
sw $t0, 156($sp)
lw $t0, 156($sp)
sw $t0, 180($sp)
move $a0, $t0
li $v0, 1
syscall
li $v0, 0
jr $ra
add $sp, $sp, 252
jr $ra