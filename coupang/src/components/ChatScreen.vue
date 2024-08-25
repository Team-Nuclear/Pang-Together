<template>
  <div class="e104_6007" @click="goToHome">
    <div class="e104_6008" ></div>
    <div class="e104_6009">
      <span class="ei104_6009_15_382">공유 장바구니</span>
    </div>
    <div class="e104_6010"></div>
    <div class="e104_6011"></div>
    <div class="e104_6012"></div>
    <div class="e104_6013"></div>
    <div class="e104_6014">
      <div class="e104_6015"></div>
      <div class="e104_6016"></div>
    </div>
    <div class="e104_6020"></div>
    <div class="e104_6036">
      <div class="ei104_6036_54208_34798"></div>
    </div>
    <div class="e104_6032">
      <div class="e104_6033">
        <div class="ei104_6033_54626_27715"></div>
      </div>
      <div class="e104_6034">
        <div class="ei104_6034_56576_34666"></div>
      </div>
      <div class="e104_6035">
        <div class="ei104_6035_52977_33949">
          <div class="ei104_6035_52977_33950">
            <div class="ei104_6035_52977_33950_51525_5219">
              <div class="ei104_6035_52977_33950_51525_5220">
                <div class="ei104_6035_52977_33950_51525_5221">
                  <div class="ei104_6035_52977_33950_51525_5221_56576_34660"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="ei104_6035_52977_33951"></div>
          <div class="ei104_6035_52977_33953">
            <div class="ei104_6035_52977_33954">
              <div class="ei104_6035_52977_33954_51525_5219">
                <div class="ei104_6035_52977_33954_51525_5220">
                  <div class="ei104_6035_52977_33954_51525_5221">
                    <div class="ei104_6035_52977_33954_51525_5221_54616_25526"></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="e113_226">
      <div class="e113_228">
        <span class="e113_229">무엇이 궁금하신가요?</span>
      </div>
    </div>
    <div class="e113_230">
      <div class="e113_236">
        <span class="e113_237">남자 5명이서 1박 2일 캠핑가는데 장볼거 추천 좀 해줘</span>
      </div>
    </div>
    <div class="e113_238">
      <div class="e113_240">
        <span class="e113_241">1. 텐트: 넉넉한 크기의 텐트를 준비해야 모두가 편안히 잘 수 있습니다.
          2. 취사도구: 가스버너나 코코아퍼로 간편하게 요리할 수 있는 도구들을 준비하세요.
          3. 식재료: 캠핑용 음식을 즐기기 위해 고기, 야채, 라면 등을 챙기세요.
          4. 물통: 충분한 양의 물을 가져가서 마실 수 있도록 해주세요.
          5. 의류: 변화무쌍한 날씨에 대비해서 옷을 충분히 챙기세요.
        </span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ComplexComponent',
   methods: {
    goToHome() {
      this.$router.push('/home-after-cart');
    },
  },
};
</script>

<style scoped>
.e104_6007 {
  overflow: hidden;
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 852px;
  position: absolute;
}

.e104_6008 {
  width: 393px;
  height: 852px;
  position: absolute;
  left: 0px;
  top: 0px;
  background-image: url(@/assets/home_screen.png);
  background-repeat: no-repeat;
  background-size: cover;
}

.e104_6009 {
  background-color: rgba(255, 255, 255, 1);
  width: 89px;
  height: 19px;
  position: absolute;
  left: 294px;
  top: 67px;
}

.ei104_6009_15_382 {
  color: rgba(65, 104, 246, 1);
  width: 87px;
  height: 18px;
  position: absolute;
  left: 0px;
  top: 0px;
  font-family: 'Inter', sans-serif;
  text-align: left;
  font-size: 15px;
  letter-spacing: 0;
}

.e104_6010 {
  width: 393px;
  height: 676px;
  position: absolute;
  left: 0px;
  top: 56px;
  background-image: url(@/assets/cart_base.png);
  background-repeat: no-repeat;
  background-size: cover;
}

.e104_6011 {
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 100px;
  position: absolute;
  left: 0px;
  top: 632px;
}




.e104_6014 {
  width: 393px;
  height: 250px;
  position: absolute;
  left: 0px;
  top: 749px;
}


.e104_6020 {
  background-color: rgba(217, 217, 217, 0.7);
  width: 393px;
  height: 852px;
  position: absolute;
  left: 0px;
  top: 0px;
}

.e104_6036 {
  background-color: rgba(243, 237, 247, 1);
  width: 399px;
  height: 23px;
  position: absolute;
  left: 0px;
  top: 827px;
}

.ei104_6036_54208_34798 {
  background-color: rgba(29, 27, 32, 1);
  width: 108px;
  height: 4px;
  position: absolute;
  left: 146px;
  top: 10px;
  border-radius: 12px;
}

.e104_6032 {
  background-color: rgba(243, 237, 247, 1);
  width: 399px;
  height: 85px;
  position: absolute;
  left: 0px;
  top: 742px;
  border-radius: 28px;
}

.e104_6033 {
  width: 24px;
  height: 24px;
  position: absolute;
  left: 16px;
  top: 30.5px;
}

.ei104_6033_54626_27715 {
  background-color: rgba(73, 69, 79, 1);
  width: 20px;
  height: 20px;
  position: absolute;
  left: 2px;
  top: 2px;
}

.e104_6034 {
  width: 24px;
  height: 24px;
  position: absolute;
  left: 56px;
  top: 30.5px;
}

.ei104_6034_56576_34666 {
  background-color: rgba(29, 27, 32, 1);
  width: 20px;
  height: 20px;
  position: absolute;
  left: 2px;
  top: 2px;
}

.e104_6035 {
  background-color: rgba(222, 216, 225, 1);
  width: 287px;
  height: 56px;
  position: absolute;
  left: 96px;
  top: 14.5px;
  border-radius: 28px;
}

.ei104_6035_52977_33949 {
  width: 287px;
  height: 56px;
  position: absolute;
  left: 0px;
  top: 0px;
}

.ei104_6035_52977_33950 {
  width: 48px;
  height: 48px;
  position: absolute;
  left: 4px;
  top: 4px;
}

.ei104_6035_52977_33950_51525_5219 {
  width: 40px;
  height: 40px;
  position: absolute;
  left: 4px;
  top: 4px;
  border-radius: 100px;
}

.ei104_6035_52977_33950_51525_5220 {
  width: 40px;
  height: 40px;
  position: absolute;
  left: 0px;
  top: 0px;
}

.ei104_6035_52977_33950_51525_5221 {
  width: 24px;
  height: 24px;
  position: absolute;
  left: 8px;
  top: 8px;
}

.ei104_6035_52977_33950_51525_5221_56576_34660 {
  background-color: rgba(73, 69, 79, 1);
  width: 20px;
  height: 16px;
  position: absolute;
  left: 2px;
  top: 4px;
}

.ei104_6035_52977_33951 {
  width: 175px;
  height: 48px;
  position: absolute;
  left: 56px;
  top: 4px;
}

.ei104_6035_52977_33953 {
  width: 48px;
  height: 48px;
  position: absolute;
  left: 235px;
  top: 4px;
}

.ei104_6035_52977_33954 {
  width: 48px;
  height: 48px;
  position: absolute;
  left: 0px;
  top: 0px;
}

.ei104_6035_52977_33954_51525_5219 {
  width: 40px;
  height: 40px;
  position: absolute;
  left: 4px;
  top: 4px;
  border-radius: 100px;
}

.ei104_6035_52977_33954_51525_5220 {
  width: 40px;
  height: 40px;
  position: absolute;
  left: 0px;
  top: 0px;
}

.ei104_6035_52977_33954_51525_5221 {
  width: 24px;
  height: 24px;
  position: absolute;
  left: 8px;
  top: 8px;
}

.ei104_6035_52977_33954_51525_5221_54616_25526 {
  background-color: rgba(73, 69, 79, 1);
  width: 14px;
  height: 19px;
  position: absolute;
  left: 5px;
  top: 2px;
}

.e113_226 {
  background-color: rgba(254, 247, 255, 1);
  width: 393px;
  height: 57px;
  position: absolute;
  left: 0px;
  top: 309px;
}

.e113_228 {
  background-color: rgba(236, 230, 240, 1);
  width: 181px;
  height: 44px;
  position: absolute;
  left: 60px;
  top: 6.5px;
  border-radius: 20px;
}

.e113_229 {
  color: rgba(73, 69, 79, 1);
  width: 149px;
  height: 24px;
  position: absolute;
  left: 16px;
  top: 10px;
  font-family: 'Roboto', sans-serif;
  text-align: left;
  font-size: 16px;
  letter-spacing: 0.5px;
}

.e113_230 {
  background-color: rgba(254, 247, 255, 1);
  width: 393px;
  height: 103px;
  position: absolute;
  left: 0px;
  top: 366px;
}

.e113_236 {
  background-color: rgba(98, 91, 113, 1);
  width: 380px;
  height: 64px;
  position: absolute;
  left: 0px;
  top: 19.5px;
  border-radius: 20px;
}

.e113_237 {
  color: rgba(255, 255, 255, 1);
  width: 348px;
  height: 48px;
  position: absolute;
  left: 16px;
  top: 8px;
  font-family: 'Roboto', sans-serif;
  text-align: left;
  font-size: 16px;
  letter-spacing: 0.5px;
}

.e113_238 {
  background-color: rgba(254, 247, 255, 1);
  width: 393px;
  height: 273px;
  position: absolute;
  left: 0px;
  top: 469px;
}

.e113_240 {
  background-color: rgba(236, 230, 240, 1);
  width: 336px;
  height: 256px;
  position: absolute;
  left: 60px;
  top: 8.5px;
  border-radius: 20px;
}

.e113_241 {
  color: rgba(73, 69, 79, 1);
  width: 304px;
  height: 240px;
  position: absolute;
  left: 16px;
  top: 8px;
  font-family: 'Roboto', sans-serif;
  text-align: left;
  font-size: 16px;
  letter-spacing: 0.5px;
}
</style>
