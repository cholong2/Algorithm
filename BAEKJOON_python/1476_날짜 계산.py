# 브루트포스
# 모든 경우의 수를 탐색해서 최적의 결과를 찾는 방법 == 완전탐색
# e <= 15,  s <=28,  m <=19
e, s, m = map(int, input().split())
# map은 입력받는 동시에 형변환이 가능! map(function, iterable)

cnt = 1
a = 1
b = 1
c = 1

while True:
    if a==e and b==s and c == m:
        break
    else:
        a +=1
        b +=1
        c +=1

        if a >15:
            a = 1
        if b> 28:
            b = 1
        if c > 19:
            c = 1

        cnt+=1

print(cnt)