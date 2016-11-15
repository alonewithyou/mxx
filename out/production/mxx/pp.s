func main {
jump %label3
%label3:
$tmp78 = move 0
$tmp77 = move $tmp78
jump %label4
%label4:
$tmp79 = slt $tmp77 2
br $tmp79 %label5 %label6
%label5:
$tmp81 = add 8 8
$tmp82 = sub $tmp81 1
$tmp83 = move $tmp82
$tmp82 = add $tmp82 1
$tmp80 = mul 4 $tmp82
$tmp84 = alloc $tmp80
store 4 $tmp84 $tmp83 0
$tmp85 = move $tmp55
$tmp86 = move $tmp77
$tmp86 = add $tmp86 1
$tmp87 = mul $tmp86 4
$tmp87 = add $tmp85 $tmp87
store 4 $tmp87 $tmp84 0
$tmp88 = move $tmp77
$tmp77 = add $tmp77 1
jump %label4
%label6:
call printBoard
call println $tmp90
ret 0
}

func printBoard {
jump %label9
%label9:
$tmp94 = move 0
$tmp92 = move $tmp94
jump %label11
%label11:
$tmp95 = slt $tmp92 $tmp71
br $tmp95 %label12 %label13
%label12:
$tmp96 = move 0
$tmp93 = move $tmp96
jump %label15
%label15:
$tmp97 = slt $tmp93 $tmp71
br $tmp97 %label16 %label17
%label16:
$tmp98 = move $tmp66
$tmp99 = move $tmp92
$tmp99 = add $tmp99 1
$tmp100 = mul $tmp99 4
$tmp100 = add $tmp98 $tmp100
$tmp101 = load 4 $tmp100 0
$tmp102 = seq $tmp101 $tmp93
br $tmp102 %label18 %label19
%label18:
call print $tmp103
jump %label20
%label19:
call print $tmp105
jump %label20
%label20:
$tmp107 = move $tmp93
$tmp93 = add $tmp93 1
jump %label15
%label17:
call println $tmp108
$tmp110 = move $tmp92
$tmp92 = add $tmp92 1
jump %label11
%label13:
call println $tmp111
ret
}