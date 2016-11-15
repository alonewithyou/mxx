printBoard:
li $t0, 0
sw $t0, 196($sp)
b label0
label0:
lw $t0, 196($sp)
lw $t1, T0
slt $t0, $t0, $t1
sw $t0, 192($sp)
lw $t0, 192($sp)
bne $t0, $zero, label1
beq $t0, $zero, label2
label1:
li $t0, 0
sw $t0, 184($sp)
b label3
label3:
lw $t0, 184($sp)
lw $t1, T0
slt $t0, $t0, $t1
sw $t0, 180($sp)
lw $t0, 180($sp)
bne $t0, $zero, label4
beq $t0, $zero, label5
label4:
li $t0, 4
lw $t1, 196($sp)
mul $t0, $t0, $t1
sw $t0, 176($sp)
lw $t0, 176($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 176($sp)
lw $t0, T2
lw $t1, 176($sp)
add $t0, $t0, $t1
sw $t0, 172($sp)
lw $t1, 172($sp)
lw $t0, 0($t1)
sw $t0, 164($sp)
lw $t0, 164($sp)
lw $t1, 184($sp)
seq $t0, $t0, $t1
sw $t0, 160($sp)
lw $t0, 160($sp)
bne $t0, $zero, label6
beq $t0, $zero, label7
label6:
sw $ra, 136($sp)
la $a0, str0
jal func_print 
lw $ra, 136($sp)
b label8
label7:
sw $ra, 136($sp)
la $a0, str1
jal func_print 
lw $ra, 136($sp)
b label8
label8:
lw $t0, 184($sp)
sw $t0, 156($sp)
lw $t0, 184($sp)
li $t1, 1
add $t0, $t0, $t1
sw $t0, 184($sp)
b label3
label5:
sw $ra, 136($sp)
la $a0, str2
jal func_println 
lw $ra, 136($sp)
lw $t0, 196($sp)
sw $t0, 152($sp)
lw $t0, 196($sp)
li $t1, 1
add $t0, $t0, $t1
sw $t0, 196($sp)
b label0
label2:
sw $ra, 136($sp)
la $a0, str3
jal func_println 
lw $ra, 136($sp)
jr $ra
main:
sub $sp, $sp, 188
li $t0, 8
sw $t0, T0
li $t0, 4
li $t1, 8
mul $t0, $t0, $t1
sw $t0, 184($sp)
lw $t0, 184($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 184($sp)
lw $a0, 184($sp)
li $v0, 9
syscall
sw $v0, 180($sp)
lw $t1, 180($sp)
li $t0, 8
sw $t0, 0($t1)
lw $t0, 180($sp)
sw $t0, T1
li $t0, 4
li $t1, 8
mul $t0, $t0, $t1
sw $t0, 172($sp)
lw $t0, 172($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 172($sp)
lw $a0, 172($sp)
li $v0, 9
syscall
sw $v0, 168($sp)
lw $t1, 168($sp)
li $t0, 8
sw $t0, 0($t1)
lw $t0, 168($sp)
sw $t0, T2
li $t0, 4
li $t1, 2
mul $t0, $t0, $t1
sw $t0, 164($sp)
lw $t0, 164($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 164($sp)
lw $a0, 164($sp)
li $v0, 9
syscall
sw $v0, 160($sp)
lw $t1, 160($sp)
li $t0, 2
sw $t0, 0($t1)
lw $t0, 160($sp)
sw $t0, T3
li $t0, 0
sw $t0, 152($sp)
b label9
label9:
lw $t0, 152($sp)
li $t1, 2
slt $t0, $t0, $t1
sw $t0, 148($sp)
lw $t0, 148($sp)
bne $t0, $zero, label10
beq $t0, $zero, label11
label10:
li $t0, 4
lw $t1, 152($sp)
mul $t0, $t0, $t1
sw $t0, 144($sp)
lw $t0, 144($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 144($sp)
lw $t0, T3
lw $t1, 144($sp)
add $t0, $t0, $t1
sw $t0, 140($sp)
li $t0, 8
li $t1, 8
add $t0, $t0, $t1
sw $t0, 136($sp)
lw $t0, 136($sp)
li $t1, 1
sub $t0, $t0, $t1
sw $t0, 132($sp)
li $t0, 4
lw $t1, 132($sp)
mul $t0, $t0, $t1
sw $t0, 128($sp)
lw $t0, 128($sp)
li $t1, 4
add $t0, $t0, $t1
sw $t0, 128($sp)
lw $a0, 128($sp)
li $v0, 9
syscall
sw $v0, 124($sp)
lw $t1, 124($sp)
lw $t0, 132($sp)
sw $t0, 0($t1)
lw $t1, 140($sp)
lw $t0, 124($sp)
sw $t0, 0($t1)
lw $t0, 152($sp)
sw $t0, 120($sp)
lw $t0, 152($sp)
li $t1, 1
add $t0, $t0, $t1
sw $t0, 152($sp)
b label9
label11:
sw $ra, 136($sp)
sub $sp, $sp, 200
sw $t0, 196($sp)
jal printBoard 
add $sp, $sp, 200
lw $ra, 136($sp)
sw $ra, 136($sp)
la $a0, str4
jal func_println 
lw $ra, 136($sp)
li $v0, 0
jr $ra
add $sp, $sp, 188
jr $ra