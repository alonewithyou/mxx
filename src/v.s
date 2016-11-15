func main {
$tmp28 = move 102
$tmp12 = move $tmp28
$tmp29 = move 0
$tmp15 = move $tmp29
$tmp14 = move $tmp29
$tmp18 = move $tmp29
$tmp13 = move $tmp29
$tmp30 = sub $tmp12 1
$tmp17 = move $tmp30
$tmp16 = move $tmp30
$tmp31 = move 0
$tmp22 = move $tmp31
$tmp21 = move $tmp31
$tmp32 = move 0
$tmp19 = move $tmp32
$tmp20 = move $tmp32
$tmp34 = mul $tmp12 $tmp12
$tmp35 = move $tmp34
$tmp35 = add $tmp35 1
$tmp33 = mul 4 $tmp35
$tmp36 = alloc $tmp33
store 4 $tmp36 $tmp34 0
$tmp23 = move $tmp36
jump %label0
%label0:
$tmp37 = move 0
$tmp26 = move $tmp37
jump %label1
%label1:
$tmp38 = mul $tmp12 $tmp12
$tmp39 = slt $tmp26 $tmp38
br $tmp39 %label2 %label3
%label2:
$tmp40 = move 0
$tmp41 = move $tmp23
$tmp42 = move $tmp26
$tmp42 = add $tmp42 1
$tmp43 = mul $tmp42 4
$tmp43 = add $tmp41 $tmp43
store 4 $tmp43 $tmp40 0
$tmp44 = move $tmp26
$tmp26 = add $tmp26 1
jump %label1
%label3:
$tmp46 = mul $tmp12 $tmp12
$tmp47 = move $tmp46
$tmp47 = add $tmp47 1
$tmp45 = mul 4 $tmp47
$tmp48 = alloc $tmp45
store 4 $tmp48 $tmp46 0
$tmp24 = move $tmp48
jump %label4
%label4:
$tmp49 = move 0
$tmp26 = move $tmp49
jump %label5
%label5:
$tmp50 = mul $tmp12 $tmp12
$tmp51 = slt $tmp26 $tmp50
br $tmp51 %label6 %label7
%label6:
$tmp52 = move 0
$tmp53 = move $tmp24
$tmp54 = move $tmp26
$tmp54 = add $tmp54 1
$tmp55 = mul $tmp54 4
$tmp55 = add $tmp53 $tmp55
store 4 $tmp55 $tmp52 0
$tmp56 = move $tmp26
$tmp26 = add $tmp26 1
jump %label5
%label7:
$tmp58 = move $tmp12
$tmp58 = add $tmp58 1
$tmp57 = mul 4 $tmp58
$tmp59 = alloc $tmp57
store 4 $tmp59 $tmp12 0
$tmp25 = move $tmp59
jump %label8
%label8:
$tmp60 = move 0
$tmp26 = move $tmp60
jump %label9
%label9:
$tmp61 = slt $tmp26 $tmp12
br $tmp61 %label10 %label11
%label10:
$tmp63 = move $tmp12
$tmp63 = add $tmp63 1
$tmp62 = mul 4 $tmp63
$tmp64 = alloc $tmp62
store 4 $tmp64 $tmp12 0
$tmp65 = move $tmp25
$tmp66 = move $tmp26
$tmp66 = add $tmp66 1
$tmp67 = mul $tmp66 4
$tmp67 = add $tmp65 $tmp67
store 4 $tmp67 $tmp64 0
jump %label12
%label12:
$tmp68 = move 0
$tmp27 = move $tmp68
jump %label13
%label13:
$tmp69 = slt $tmp27 $tmp12
br $tmp69 %label14 %label15
%label14:
$tmp70 = neg 1
$tmp71 = move $tmp25
$tmp72 = move $tmp26
$tmp72 = add $tmp72 1
$tmp73 = mul $tmp72 4
$tmp73 = add $tmp71 $tmp73
$tmp74 = load 4 $tmp73 0
$tmp75 = move $tmp74
$tmp76 = move $tmp27
$tmp76 = add $tmp76 1
$tmp77 = mul $tmp76 4
$tmp77 = add $tmp75 $tmp77
store 4 $tmp77 $tmp70 0
$tmp78 = move $tmp27
$tmp27 = add $tmp27 1
jump %label13
%label15:
$tmp79 = move $tmp26
$tmp26 = add $tmp26 1
jump %label9
%label11:
$tmp80 = move $tmp23
$tmp81 = move 0
$tmp81 = add $tmp81 1
$tmp82 = mul $tmp81 4
$tmp82 = add $tmp80 $tmp82
store 4 $tmp82 $tmp14 0
$tmp83 = move $tmp24
$tmp84 = move 0
$tmp84 = add $tmp84 1
$tmp85 = mul $tmp84 4
$tmp85 = add $tmp83 $tmp85
store 4 $tmp85 $tmp15 0
$tmp86 = move $tmp25
$tmp87 = move $tmp14
$tmp87 = add $tmp87 1
$tmp88 = mul $tmp87 4
$tmp88 = add $tmp86 $tmp88
$tmp89 = load 4 $tmp88 0
$tmp90 = move $tmp89
$tmp91 = move $tmp15
$tmp91 = add $tmp91 1
$tmp92 = mul $tmp91 4
$tmp92 = add $tmp90 $tmp92
$tmp93 = load 4 $tmp92 0
$tmp94 = seq $tmp93 0
jump %label16
%label16:
$tmp95 = sle $tmp13 $tmp18
br $tmp95 %label17 %label18
%label17:
$tmp96 = call toString $tmp13
$tmp98 = call stringunion $tmp97 $tmp96
$tmp99 = call toString $tmp18
$tmp100 = call stringunion $tmp99 $tmp98
call println $tmp100
$tmp102 = move $tmp25
$tmp103 = move $tmp23
$tmp104 = move $tmp13
$tmp104 = add $tmp104 1
$tmp105 = mul $tmp104 4
$tmp105 = add $tmp103 $tmp105
$tmp106 = load 4 $tmp105 0
$tmp107 = move $tmp106
$tmp107 = add $tmp107 1
$tmp108 = mul $tmp107 4
$tmp108 = add $tmp102 $tmp108
$tmp109 = load 4 $tmp108 0
$tmp110 = move $tmp109
$tmp111 = move $tmp24
$tmp112 = move $tmp13
$tmp112 = add $tmp112 1
$tmp113 = mul $tmp112 4
$tmp113 = add $tmp111 $tmp113
$tmp114 = load 4 $tmp113 0
$tmp115 = move $tmp114
$tmp115 = add $tmp115 1
$tmp116 = mul $tmp115 4
$tmp116 = add $tmp110 $tmp116
$tmp117 = load 4 $tmp116 0
$tmp20 = move $tmp117
$tmp118 = move $tmp23
$tmp119 = move $tmp13
$tmp119 = add $tmp119 1
$tmp120 = mul $tmp119 4
$tmp120 = add $tmp118 $tmp120
$tmp121 = load 4 $tmp120 0
$tmp122 = sub $tmp121 1
$tmp21 = move $tmp122
$tmp123 = move $tmp24
$tmp124 = move $tmp13
$tmp124 = add $tmp124 1
$tmp125 = mul $tmp124 4
$tmp125 = add $tmp123 $tmp125
$tmp126 = load 4 $tmp125 0
$tmp127 = sub $tmp126 2
$tmp22 = move $tmp127
call println $tmp128
jump %label19
%label19:
$tmp130 = call check $tmp21 $tmp12
$tmp131 = call check $tmp22 $tmp12
$tmp132 = and $tmp130 $tmp131
$tmp133 = move $tmp25
$tmp134 = move $tmp21
$tmp134 = add $tmp134 1
$tmp135 = mul $tmp134 4
$tmp135 = add $tmp133 $tmp135
$tmp136 = load 4 $tmp135 0
$tmp137 = move $tmp136
$tmp138 = move $tmp22
$tmp138 = add $tmp138 1
$tmp139 = mul $tmp138 4
$tmp139 = add $tmp137 $tmp139
$tmp140 = load 4 $tmp139 0
$tmp141 = neg 1
$tmp142 = seq $tmp140 $tmp141
$tmp143 = and $tmp132 $tmp142
br $tmp143 %label20 %label21
%label20:
call println $tmp144
$tmp146 = add $tmp18 1
$tmp18 = move $tmp146
$tmp147 = move $tmp23
$tmp148 = move $tmp18
$tmp148 = add $tmp148 1
$tmp149 = mul $tmp148 4
$tmp149 = add $tmp147 $tmp149
store 4 $tmp149 $tmp21 0
$tmp150 = move $tmp24
$tmp151 = move $tmp18
$tmp151 = add $tmp151 1
$tmp152 = mul $tmp151 4
$tmp152 = add $tmp150 $tmp152
store 4 $tmp152 $tmp22 0
$tmp153 = add $tmp20 1
$tmp154 = move $tmp25
$tmp155 = move $tmp21
$tmp155 = add $tmp155 1
$tmp156 = mul $tmp155 4
$tmp156 = add $tmp154 $tmp156
$tmp157 = load 4 $tmp156 0
$tmp158 = move $tmp157
$tmp159 = move $tmp22
$tmp159 = add $tmp159 1
$tmp160 = mul $tmp159 4
$tmp160 = add $tmp158 $tmp160
store 4 $tmp160 $tmp153 0
jump %label23
%label23:
$tmp161 = seq $tmp21 $tmp16
$tmp162 = seq $tmp22 $tmp17
$tmp163 = and $tmp161 $tmp162
br $tmp163 %label24 %label25
%label24:
$tmp164 = move 1
$tmp19 = move $tmp164
jump %label26
%label25:
jump %label26
%label26:
jump %label22
%label21:
jump %label22
%label22:
call println $tmp165
$tmp167 = move $tmp23
$tmp168 = move $tmp13
$tmp168 = add $tmp168 1
$tmp169 = mul $tmp168 4
$tmp169 = add $tmp167 $tmp169
$tmp170 = load 4 $tmp169 0
$tmp171 = sub $tmp170 1
$tmp21 = move $tmp171
$tmp172 = move $tmp24
$tmp173 = move $tmp13
$tmp173 = add $tmp173 1
$tmp174 = mul $tmp173 4
$tmp174 = add $tmp172 $tmp174
$tmp175 = load 4 $tmp174 0
$tmp176 = add $tmp175 2
$tmp22 = move $tmp176
jump %label27
%label27:
$tmp177 = call check $tmp21 $tmp12
$tmp178 = call check $tmp22 $tmp12
$tmp179 = and $tmp177 $tmp178
$tmp180 = move $tmp25
$tmp181 = move $tmp21
$tmp181 = add $tmp181 1
$tmp182 = mul $tmp181 4
$tmp182 = add $tmp180 $tmp182
$tmp183 = load 4 $tmp182 0
$tmp184 = move $tmp183
$tmp185 = move $tmp22
$tmp185 = add $tmp185 1
$tmp186 = mul $tmp185 4
$tmp186 = add $tmp184 $tmp186
$tmp187 = load 4 $tmp186 0
$tmp188 = neg 1
$tmp189 = seq $tmp187 $tmp188
$tmp190 = and $tmp179 $tmp189
br $tmp190 %label28 %label29
%label28:
$tmp191 = add $tmp18 1
$tmp18 = move $tmp191
$tmp192 = move $tmp23
$tmp193 = move $tmp18
$tmp193 = add $tmp193 1
$tmp194 = mul $tmp193 4
$tmp194 = add $tmp192 $tmp194
store 4 $tmp194 $tmp21 0
$tmp195 = move $tmp24
$tmp196 = move $tmp18
$tmp196 = add $tmp196 1
$tmp197 = mul $tmp196 4
$tmp197 = add $tmp195 $tmp197
store 4 $tmp197 $tmp22 0
$tmp198 = add $tmp20 1
$tmp199 = move $tmp25
$tmp200 = move $tmp21
$tmp200 = add $tmp200 1
$tmp201 = mul $tmp200 4
$tmp201 = add $tmp199 $tmp201
$tmp202 = load 4 $tmp201 0
$tmp203 = move $tmp202
$tmp204 = move $tmp22
$tmp204 = add $tmp204 1
$tmp205 = mul $tmp204 4
$tmp205 = add $tmp203 $tmp205
store 4 $tmp205 $tmp198 0
jump %label31
%label31:
$tmp206 = seq $tmp21 $tmp16
$tmp207 = seq $tmp22 $tmp17
$tmp208 = and $tmp206 $tmp207
br $tmp208 %label32 %label33
%label32:
$tmp209 = move 1
$tmp19 = move $tmp209
jump %label34
%label33:
jump %label34
%label34:
jump %label30
%label29:
jump %label30
%label30:
$tmp210 = move $tmp23
$tmp211 = move $tmp13
$tmp211 = add $tmp211 1
$tmp212 = mul $tmp211 4
$tmp212 = add $tmp210 $tmp212
$tmp213 = load 4 $tmp212 0
$tmp214 = add $tmp213 1
$tmp21 = move $tmp214
$tmp215 = move $tmp24
$tmp216 = move $tmp13
$tmp216 = add $tmp216 1
$tmp217 = mul $tmp216 4
$tmp217 = add $tmp215 $tmp217
$tmp218 = load 4 $tmp217 0
$tmp219 = sub $tmp218 2
$tmp22 = move $tmp219
jump %label35
%label35:
$tmp220 = call check $tmp21 $tmp12
$tmp221 = call check $tmp22 $tmp12
$tmp222 = and $tmp220 $tmp221
$tmp223 = move $tmp25
$tmp224 = move $tmp21
$tmp224 = add $tmp224 1
$tmp225 = mul $tmp224 4
$tmp225 = add $tmp223 $tmp225
$tmp226 = load 4 $tmp225 0
$tmp227 = move $tmp226
$tmp228 = move $tmp22
$tmp228 = add $tmp228 1
$tmp229 = mul $tmp228 4
$tmp229 = add $tmp227 $tmp229
$tmp230 = load 4 $tmp229 0
$tmp231 = neg 1
$tmp232 = seq $tmp230 $tmp231
$tmp233 = and $tmp222 $tmp232
br $tmp233 %label36 %label37
%label36:
$tmp234 = add $tmp18 1
$tmp18 = move $tmp234
$tmp235 = move $tmp23
$tmp236 = move $tmp18
$tmp236 = add $tmp236 1
$tmp237 = mul $tmp236 4
$tmp237 = add $tmp235 $tmp237
store 4 $tmp237 $tmp21 0
$tmp238 = move $tmp24
$tmp239 = move $tmp18
$tmp239 = add $tmp239 1
$tmp240 = mul $tmp239 4
$tmp240 = add $tmp238 $tmp240
store 4 $tmp240 $tmp22 0
$tmp241 = add $tmp20 1
$tmp242 = move $tmp25
$tmp243 = move $tmp21
$tmp243 = add $tmp243 1
$tmp244 = mul $tmp243 4
$tmp244 = add $tmp242 $tmp244
$tmp245 = load 4 $tmp244 0
$tmp246 = move $tmp245
$tmp247 = move $tmp22
$tmp247 = add $tmp247 1
$tmp248 = mul $tmp247 4
$tmp248 = add $tmp246 $tmp248
store 4 $tmp248 $tmp241 0
jump %label39
%label39:
$tmp249 = seq $tmp21 $tmp16
$tmp250 = seq $tmp22 $tmp17
$tmp251 = and $tmp249 $tmp250
br $tmp251 %label40 %label41
%label40:
$tmp252 = move 1
$tmp19 = move $tmp252
jump %label42
%label41:
jump %label42
%label42:
jump %label38
%label37:
jump %label38
%label38:
$tmp253 = move $tmp23
$tmp254 = move $tmp13
$tmp254 = add $tmp254 1
$tmp255 = mul $tmp254 4
$tmp255 = add $tmp253 $tmp255
$tmp256 = load 4 $tmp255 0
$tmp257 = add $tmp256 1
$tmp21 = move $tmp257
$tmp258 = move $tmp24
$tmp259 = move $tmp13
$tmp259 = add $tmp259 1
$tmp260 = mul $tmp259 4
$tmp260 = add $tmp258 $tmp260
$tmp261 = load 4 $tmp260 0
$tmp262 = add $tmp261 2
$tmp22 = move $tmp262
jump %label43
%label43:
$tmp263 = call check $tmp21 $tmp12
$tmp264 = call check $tmp22 $tmp12
$tmp265 = and $tmp263 $tmp264
$tmp266 = move $tmp25
$tmp267 = move $tmp21
$tmp267 = add $tmp267 1
$tmp268 = mul $tmp267 4
$tmp268 = add $tmp266 $tmp268
$tmp269 = load 4 $tmp268 0
$tmp270 = move $tmp269
$tmp271 = move $tmp22
$tmp271 = add $tmp271 1
$tmp272 = mul $tmp271 4
$tmp272 = add $tmp270 $tmp272
$tmp273 = load 4 $tmp272 0
$tmp274 = neg 1
$tmp275 = seq $tmp273 $tmp274
$tmp276 = and $tmp265 $tmp275
br $tmp276 %label44 %label45
%label44:
$tmp277 = add $tmp18 1
$tmp18 = move $tmp277
$tmp278 = move $tmp23
$tmp279 = move $tmp18
$tmp279 = add $tmp279 1
$tmp280 = mul $tmp279 4
$tmp280 = add $tmp278 $tmp280
store 4 $tmp280 $tmp21 0
$tmp281 = move $tmp24
$tmp282 = move $tmp18
$tmp282 = add $tmp282 1
$tmp283 = mul $tmp282 4
$tmp283 = add $tmp281 $tmp283
store 4 $tmp283 $tmp22 0
$tmp284 = add $tmp20 1
$tmp285 = move $tmp25
$tmp286 = move $tmp21
$tmp286 = add $tmp286 1
$tmp287 = mul $tmp286 4
$tmp287 = add $tmp285 $tmp287
$tmp288 = load 4 $tmp287 0
$tmp289 = move $tmp288
$tmp290 = move $tmp22
$tmp290 = add $tmp290 1
$tmp291 = mul $tmp290 4
$tmp291 = add $tmp289 $tmp291
store 4 $tmp291 $tmp284 0
jump %label47
%label47:
$tmp292 = seq $tmp21 $tmp16
$tmp293 = seq $tmp22 $tmp17
$tmp294 = and $tmp292 $tmp293
br $tmp294 %label48 %label49
%label48:
$tmp295 = move 1
$tmp19 = move $tmp295
jump %label50
%label49:
jump %label50
%label50:
jump %label46
%label45:
jump %label46
%label46:
$tmp296 = move $tmp23
$tmp297 = move $tmp13
$tmp297 = add $tmp297 1
$tmp298 = mul $tmp297 4
$tmp298 = add $tmp296 $tmp298
$tmp299 = load 4 $tmp298 0
$tmp300 = sub $tmp299 2
$tmp21 = move $tmp300
$tmp301 = move $tmp24
$tmp302 = move $tmp13
$tmp302 = add $tmp302 1
$tmp303 = mul $tmp302 4
$tmp303 = add $tmp301 $tmp303
$tmp304 = load 4 $tmp303 0
$tmp305 = sub $tmp304 1
$tmp22 = move $tmp305
jump %label51
%label51:
$tmp306 = call check $tmp21 $tmp12
$tmp307 = call check $tmp22 $tmp12
$tmp308 = and $tmp306 $tmp307
$tmp309 = move $tmp25
$tmp310 = move $tmp21
$tmp310 = add $tmp310 1
$tmp311 = mul $tmp310 4
$tmp311 = add $tmp309 $tmp311
$tmp312 = load 4 $tmp311 0
$tmp313 = move $tmp312
$tmp314 = move $tmp22
$tmp314 = add $tmp314 1
$tmp315 = mul $tmp314 4
$tmp315 = add $tmp313 $tmp315
$tmp316 = load 4 $tmp315 0
$tmp317 = neg 1
$tmp318 = seq $tmp316 $tmp317
$tmp319 = and $tmp308 $tmp318
br $tmp319 %label52 %label53
%label52:
$tmp320 = add $tmp18 1
$tmp18 = move $tmp320
$tmp321 = move $tmp23
$tmp322 = move $tmp18
$tmp322 = add $tmp322 1
$tmp323 = mul $tmp322 4
$tmp323 = add $tmp321 $tmp323
store 4 $tmp323 $tmp21 0
$tmp324 = move $tmp24
$tmp325 = move $tmp18
$tmp325 = add $tmp325 1
$tmp326 = mul $tmp325 4
$tmp326 = add $tmp324 $tmp326
store 4 $tmp326 $tmp22 0
$tmp327 = add $tmp20 1
$tmp328 = move $tmp25
$tmp329 = move $tmp21
$tmp329 = add $tmp329 1
$tmp330 = mul $tmp329 4
$tmp330 = add $tmp328 $tmp330
$tmp331 = load 4 $tmp330 0
$tmp332 = move $tmp331
$tmp333 = move $tmp22
$tmp333 = add $tmp333 1
$tmp334 = mul $tmp333 4
$tmp334 = add $tmp332 $tmp334
store 4 $tmp334 $tmp327 0
jump %label55
%label55:
$tmp335 = seq $tmp21 $tmp16
$tmp336 = seq $tmp22 $tmp17
$tmp337 = and $tmp335 $tmp336
br $tmp337 %label56 %label57
%label56:
$tmp338 = move 1
$tmp19 = move $tmp338
jump %label58
%label57:
jump %label58
%label58:
jump %label54
%label53:
jump %label54
%label54:
$tmp339 = move $tmp23
$tmp340 = move $tmp13
$tmp340 = add $tmp340 1
$tmp341 = mul $tmp340 4
$tmp341 = add $tmp339 $tmp341
$tmp342 = load 4 $tmp341 0
$tmp343 = sub $tmp342 2
$tmp21 = move $tmp343
$tmp344 = move $tmp24
$tmp345 = move $tmp13
$tmp345 = add $tmp345 1
$tmp346 = mul $tmp345 4
$tmp346 = add $tmp344 $tmp346
$tmp347 = load 4 $tmp346 0
$tmp348 = add $tmp347 1
$tmp22 = move $tmp348
jump %label59
%label59:
$tmp349 = call check $tmp21 $tmp12
$tmp350 = call check $tmp22 $tmp12
$tmp351 = and $tmp349 $tmp350
$tmp352 = move $tmp25
$tmp353 = move $tmp21
$tmp353 = add $tmp353 1
$tmp354 = mul $tmp353 4
$tmp354 = add $tmp352 $tmp354
$tmp355 = load 4 $tmp354 0
$tmp356 = move $tmp355
$tmp357 = move $tmp22
$tmp357 = add $tmp357 1
$tmp358 = mul $tmp357 4
$tmp358 = add $tmp356 $tmp358
$tmp359 = load 4 $tmp358 0
$tmp360 = neg 1
$tmp361 = seq $tmp359 $tmp360
$tmp362 = and $tmp351 $tmp361
br $tmp362 %label60 %label61
%label60:
$tmp363 = add $tmp18 1
$tmp18 = move $tmp363
$tmp364 = move $tmp23
$tmp365 = move $tmp18
$tmp365 = add $tmp365 1
$tmp366 = mul $tmp365 4
$tmp366 = add $tmp364 $tmp366
store 4 $tmp366 $tmp21 0
$tmp367 = move $tmp24
$tmp368 = move $tmp18
$tmp368 = add $tmp368 1
$tmp369 = mul $tmp368 4
$tmp369 = add $tmp367 $tmp369
store 4 $tmp369 $tmp22 0
$tmp370 = add $tmp20 1
$tmp371 = move $tmp25
$tmp372 = move $tmp21
$tmp372 = add $tmp372 1
$tmp373 = mul $tmp372 4
$tmp373 = add $tmp371 $tmp373
$tmp374 = load 4 $tmp373 0
$tmp375 = move $tmp374
$tmp376 = move $tmp22
$tmp376 = add $tmp376 1
$tmp377 = mul $tmp376 4
$tmp377 = add $tmp375 $tmp377
store 4 $tmp377 $tmp370 0
jump %label63
%label63:
$tmp378 = seq $tmp21 $tmp16
$tmp379 = seq $tmp22 $tmp17
$tmp380 = and $tmp378 $tmp379
br $tmp380 %label64 %label65
%label64:
$tmp381 = move 1
$tmp19 = move $tmp381
jump %label66
%label65:
jump %label66
%label66:
jump %label62
%label61:
jump %label62
%label62:
$tmp382 = move $tmp23
$tmp383 = move $tmp13
$tmp383 = add $tmp383 1
$tmp384 = mul $tmp383 4
$tmp384 = add $tmp382 $tmp384
$tmp385 = load 4 $tmp384 0
$tmp386 = add $tmp385 2
$tmp21 = move $tmp386
$tmp387 = move $tmp24
$tmp388 = move $tmp13
$tmp388 = add $tmp388 1
$tmp389 = mul $tmp388 4
$tmp389 = add $tmp387 $tmp389
$tmp390 = load 4 $tmp389 0
$tmp391 = sub $tmp390 1
$tmp22 = move $tmp391
jump %label67
%label67:
$tmp392 = call check $tmp21 $tmp12
$tmp393 = call check $tmp22 $tmp12
$tmp394 = and $tmp392 $tmp393
$tmp395 = move $tmp25
$tmp396 = move $tmp21
$tmp396 = add $tmp396 1
$tmp397 = mul $tmp396 4
$tmp397 = add $tmp395 $tmp397
$tmp398 = load 4 $tmp397 0
$tmp399 = move $tmp398
$tmp400 = move $tmp22
$tmp400 = add $tmp400 1
$tmp401 = mul $tmp400 4
$tmp401 = add $tmp399 $tmp401
$tmp402 = load 4 $tmp401 0
$tmp403 = neg 1
$tmp404 = seq $tmp402 $tmp403
$tmp405 = and $tmp394 $tmp404
br $tmp405 %label68 %label69
%label68:
$tmp406 = add $tmp18 1
$tmp18 = move $tmp406
$tmp407 = move $tmp23
$tmp408 = move $tmp18
$tmp408 = add $tmp408 1
$tmp409 = mul $tmp408 4
$tmp409 = add $tmp407 $tmp409
store 4 $tmp409 $tmp21 0
$tmp410 = move $tmp24
$tmp411 = move $tmp18
$tmp411 = add $tmp411 1
$tmp412 = mul $tmp411 4
$tmp412 = add $tmp410 $tmp412
store 4 $tmp412 $tmp22 0
$tmp413 = add $tmp20 1
$tmp414 = move $tmp25
$tmp415 = move $tmp21
$tmp415 = add $tmp415 1
$tmp416 = mul $tmp415 4
$tmp416 = add $tmp414 $tmp416
$tmp417 = load 4 $tmp416 0
$tmp418 = move $tmp417
$tmp419 = move $tmp22
$tmp419 = add $tmp419 1
$tmp420 = mul $tmp419 4
$tmp420 = add $tmp418 $tmp420
store 4 $tmp420 $tmp413 0
jump %label71
%label71:
$tmp421 = seq $tmp21 $tmp16
$tmp422 = seq $tmp22 $tmp17
$tmp423 = and $tmp421 $tmp422
br $tmp423 %label72 %label73
%label72:
$tmp424 = move 1
$tmp19 = move $tmp424
jump %label74
%label73:
jump %label74
%label74:
jump %label70
%label69:
jump %label70
%label70:
$tmp425 = move $tmp23
$tmp426 = move $tmp13
$tmp426 = add $tmp426 1
$tmp427 = mul $tmp426 4
$tmp427 = add $tmp425 $tmp427
$tmp428 = load 4 $tmp427 0
$tmp429 = add $tmp428 2
$tmp21 = move $tmp429
$tmp430 = move $tmp24
$tmp431 = move $tmp13
$tmp431 = add $tmp431 1
$tmp432 = mul $tmp431 4
$tmp432 = add $tmp430 $tmp432
$tmp433 = load 4 $tmp432 0
$tmp434 = add $tmp433 1
$tmp22 = move $tmp434
jump %label75
%label75:
$tmp435 = call check $tmp21 $tmp12
$tmp436 = call check $tmp22 $tmp12
$tmp437 = and $tmp435 $tmp436
$tmp438 = move $tmp25
$tmp439 = move $tmp21
$tmp439 = add $tmp439 1
$tmp440 = mul $tmp439 4
$tmp440 = add $tmp438 $tmp440
$tmp441 = load 4 $tmp440 0
$tmp442 = move $tmp441
$tmp443 = move $tmp22
$tmp443 = add $tmp443 1
$tmp444 = mul $tmp443 4
$tmp444 = add $tmp442 $tmp444
$tmp445 = load 4 $tmp444 0
$tmp446 = neg 1
$tmp447 = seq $tmp445 $tmp446
$tmp448 = and $tmp437 $tmp447
br $tmp448 %label76 %label77
%label76:
$tmp449 = add $tmp18 1
$tmp18 = move $tmp449
$tmp450 = move $tmp23
$tmp451 = move $tmp18
$tmp451 = add $tmp451 1
$tmp452 = mul $tmp451 4
$tmp452 = add $tmp450 $tmp452
store 4 $tmp452 $tmp21 0
$tmp453 = move $tmp24
$tmp454 = move $tmp18
$tmp454 = add $tmp454 1
$tmp455 = mul $tmp454 4
$tmp455 = add $tmp453 $tmp455
store 4 $tmp455 $tmp22 0
$tmp456 = add $tmp20 1
$tmp457 = move $tmp25
$tmp458 = move $tmp21
$tmp458 = add $tmp458 1
$tmp459 = mul $tmp458 4
$tmp459 = add $tmp457 $tmp459
$tmp460 = load 4 $tmp459 0
$tmp461 = move $tmp460
$tmp462 = move $tmp22
$tmp462 = add $tmp462 1
$tmp463 = mul $tmp462 4
$tmp463 = add $tmp461 $tmp463
store 4 $tmp463 $tmp456 0
jump %label79
%label79:
$tmp464 = seq $tmp21 $tmp16
$tmp465 = seq $tmp22 $tmp17
$tmp466 = and $tmp464 $tmp465
br $tmp466 %label80 %label81
%label80:
$tmp467 = move 1
$tmp19 = move $tmp467
jump %label82
%label81:
jump %label82
%label82:
jump %label78
%label77:
jump %label78
%label78:
call println $tmp468
jump %label83
%label83:
$tmp470 = seq $tmp19 1
br $tmp470 %label84 %label85
%label84:
jump %label18
jump %label86
%label85:
jump %label86
%label86:
$tmp471 = add $tmp13 1
$tmp13 = move $tmp471
jump %label16
%label18:
jump %label87
%label87:
$tmp472 = seq $tmp19 1
br $tmp472 %label88 %label89
%label88:
$tmp473 = move $tmp25
$tmp474 = move $tmp16
$tmp474 = add $tmp474 1
$tmp475 = mul $tmp474 4
$tmp475 = add $tmp473 $tmp475
$tmp476 = load 4 $tmp475 0
$tmp477 = move $tmp476
$tmp478 = move $tmp17
$tmp478 = add $tmp478 1
$tmp479 = mul $tmp478 4
$tmp479 = add $tmp477 $tmp479
$tmp480 = load 4 $tmp479 0
$tmp481 = call toString $tmp480
call println $tmp481
jump %label90
%label89:
call print $tmp483
jump %label90
%label90:
$tmp485 = move 0
ret $tmp485
}

func check $tmp486 $tmp487 {
call println $tmp488
$tmp490 = slt $tmp486 $tmp487
$tmp491 = sge $tmp486 0
$tmp492 = and $tmp490 $tmp491
$tmp493 = move $tmp492
ret $tmp493
}
