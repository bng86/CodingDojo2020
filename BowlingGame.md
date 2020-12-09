## Rule

1. 每次遊戲有 10 局 (frame)
2. 每局有 10 個球瓶 (pins)，每局可以投擲 (roll) 兩球
3. 每局有 10 個球瓶 (pins) 可以被擊倒
4. 每局的分數為擊倒球瓶的總和，若 spare 或是 strike 則有額外的加分 (bonus)
5. 本局擊倒的球瓶總數為 10 時稱為 spare，bonus 為下一球擊倒球瓶的分數
6. 本局一次擊倒所有的球瓶時稱為 strike，bonus 為下兩球擊倒球瓶的分數總和
7. 當最後一局時產生 spare 則可以多打一球， strike 時則可以多打兩球

## Test Case

1. 0 0 0 0 0 0 0 0 0 0 -> score 0
2. x x x x x x x x x x x x -> score 300
3. 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 -> score 150
4. 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- -> score 90