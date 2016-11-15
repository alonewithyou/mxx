func origin $tmp252 {
$tmp254 = move $tmp252
$tmp252 = add $tmp252 1
$tmp253 = mul 4 $tmp252
$tmp255 = alloc $tmp253
store 4 $tmp255 $tmp254 0
store 4 $tmp234 $tmp255 0
jump %label3
%label3:
$tmp256 = move 0
$tmp197 = move $tmp256
jump %label4
%label4:
$tmp257 = slt $tmp197 $tmp252
br $tmp257 %label5 %label6
%label5:
$tmp259 = move $tmp252
$tmp252 = add $tmp252 1
$tmp258 = mul 4 $tmp252
$tmp260 = alloc $tmp258
store 4 $tmp260 $tmp259 0
$tmp261 = move $tmp234
$tmp262 = move $tmp197
$tmp262 = add $tmp262 1
$tmp263 = mul $tmp262 4
$tmp263 = add $tmp261 $tmp263
store 4 $tmp263 $tmp260 0
jump %label7
%label7:
$tmp264 = move 0
$tmp179 = move $tmp264
jump %label8
%label8:
$tmp265 = slt $tmp179 $tmp252
br $tmp265 %label9 %label10
%label9:
$tmp266 = move 0
$tmp267 = move $tmp234
$tmp268 = move $tmp197
$tmp268 = add $tmp268 1
$tmp269 = mul $tmp268 4
$tmp269 = add $tmp267 $tmp269
$tmp270 = load 4 $tmp269 0
$tmp271 = move $tmp270
$tmp272 = move $tmp179
$tmp272 = add $tmp272 1
$tmp273 = mul $tmp272 4
$tmp273 = add $tmp271 $tmp273
store 4 $tmp273 $tmp266 0
$tmp274 = move $tmp179
$tmp179 = add $tmp179 1
jump %label8
%label10:
$tmp275 = call toString $tmp197
call println $tmp275
$tmp277 = move $tmp197
$tmp197 = add $tmp197 1
jump %label4
%label6:
}