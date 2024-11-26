# import game만 해도 game으로 render_test 접근 가능
from .graphic.render import render_test
# game package기준에서 경로 시작이라 .graphic부터 시작

# game package에서 공유할 변수
VERSION = 1.0

# game package에서 공유할 함수
def show_game_version() :
    print(f'게임 버전 : {VERSION}')

# 초기화 작업 : import 시 최초 한번만 실행
print('---- 게임 로딩 초기화..... ----')