<template>
  <div class="e48_319">
    <div class="e48_320"></div>
    <div class="e48_321">
      <span class="ei48_321_15_382">공유 장바구니</span>
    </div>
    <div class="e48_322"></div>
    <div class="e48_323"></div>
    <div class="e48_324"></div>
    <div class="e48_325"></div>
    <div class="e48_326">
      <div class="e48_328"></div>
      <div class="e48_327"  @click="goToPayInitial"></div>
      <div class="e113_243" @click="goToChatScreen"></div>
      
    </div>
  </div>
</template>

<script>
export default {
  name: 'TogetherCartList',
  methods: {
    goToPayInitial() {
      this.$router.push('/pay-initial');
    },

    goToChatScreen() {
      this.$router.push('/chat');
    },
  },
};
</script>

<style scoped>
.e48_319 {
  overflow: hidden;
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 852px;
  position: absolute;
}

.e48_320 {
  width: 393px;
  height: 852px;
  position: absolute;
  left: 0px;
  top: 0px;
  background-image: url(@/assets/home_screen.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e48_321 {
  background-color: rgba(255, 255, 255, 1);
  width: 89px;
  height: 19px;
  position: absolute;
  left: 294px;
  top: 67px;
}

.ei48_321_15_382 {
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

.e48_322 {
  width: 393px;
  height: 676px;
  position: absolute;
  left: 0px;
  top: 56px;
  background-image: url(@/assets/cart_base.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e48_323 {
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 100px;
  position: absolute;
  left: 0px;
  top: 632px;
}

.e48_324 {
  width: 393px;
  height: 95px;
  position: absolute;
  left: 0px;
  top: 469px;
  background-image: url(@/assets/fresh.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e48_325 {
  width: 393px;
  height: 185px;
  position: absolute;
  left: 0px;
  top: 564px;
  background-image: url(@/assets/cart_list_1.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e48_326 {
  width: 393px;
  height: 250px;
  position: absolute;
  left: 0px;
  top: 749px;
}

.e48_327 {
  width: 393px;
  height: 100px;
  position: absolute;
  left: 0px;
  top: 0px;
  background-image: url(@/assets/cart_order_bar.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e113_243 {
  width: 50px;
  height: 50px;
  position: absolute;
  left: 320px;
  top: 00px;
  background-image: url(@/assets/talk_icon.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e48_328 {
  width: 393px;
  height: 201px;
  position: absolute;
  left: 0px;
  top: 0px;
  background-image: url(@/assets/cart_list_2.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
