# 상위 Package 접근
from ..graphic.render import render_test

# 초기화 작업
print('--- 게임 사운드 초기화... ---')

# *로 import 할 module / 13버전 부터는 생략 가능
__all__ = ['echo']