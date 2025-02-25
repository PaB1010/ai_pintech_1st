import os

# keras 2버전으로 다운그레이드 
os.environ['TF_USE_LEGACY_KERAS'] = '1'  

import tensorflow as tf
import tensorflow_hub as hub
import tensorflow_text as text

import json

tf.get_logger().setLevel('ERROR')

model = tf.saved_model.load("C:/naver_bert")

inputs = [
    '지루하지는 않은데 완전 막장임... 돈주고 보기에는....',  # this is the same sentence tried earlier
    '뭐야 이 평점들은.... 나쁘진 않지만 10점 짜리는 더더욱 아니잖아',
    '3D만 아니었어도 별 다섯 개 줬을텐데.. 왜 3D로 나와서 제 심기를 불편하게 하죠??',
    '오랜만에 평점 로긴했네ㅋㅋ 킹왕짱 쌈뽕한 영화를 만났습니다 강렬하게 육쾌함',
    '절대 봐서는 안 될 영화.. 재미도 없고 기분만 잡치고.. 한 세트장에서 다 해먹네'
]

# tensorflow 객체
reloaded_results = tf.sigmoid(model(tf.constant(inputs)))

# List 컴프리헨션 데이터 가공
results = [float(reloaded_results[i][0]) for i in range(len(inputs))]

print(results)