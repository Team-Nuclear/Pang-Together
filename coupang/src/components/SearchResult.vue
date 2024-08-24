<template>
  <div class="e42_252">
    <div class="e42_256"></div>
    <div class="e42_258">
      <div class="e42_259" @click="goToSearchResultAfterAdd">
        <span class="ei42_259_9762_429"></span>
      </div>
      <span class="e42_260" @click="goToSearchResultAfterAdd">공유 장바구니 담기</span>
    </div>
    <div class="e48_318"></div>
  </div>
</template>

<script>
export default {
  name: 'SearchResult',
  methods: {
    goToSearchResultAfterAdd() {
      this.$router.push('/search-result-after-add');
    },
  },
};
</script>

<style scoped>
.e42_252 {
  overflow: hidden;
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 852px;
  position: absolute;
}

.e42_256 {
  width: 388px;
  height: 841px;
  position: absolute;
  left: 0px;
  top: 11px;
  background-image: url(@/assets/search_result.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e42_258 {
  width: 184px;
  height: 44px;
  position: absolute;
  left: 199px;
  top: 766px;
}

.e42_259 {
  background-color: rgba(52, 106, 255, 1);
  width: 184px;
  height: 44px;
  position: absolute;
  left: 0px;
  top: 0px;
  border-radius: 4px;
}

.ei42_259_9762_429 {
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  color: rgba(245, 245, 245, 1);
  position: absolute;
  left: 92px;
  top: 9.5px;
  font-family: 'Inter', sans-serif;
  text-align: left;
  font-size: 25px;
  letter-spacing: 0;
}

.e42_260 {
  color: rgba(255, 255, 255, 1);
  width: 184px;
  height: 44px;
  position: absolute;
  left: 0px;
  top: 0px;
  font-family: 'Roboto', sans-serif;
  text-align: center;
  font-size: 14px;
  letter-spacing: 0;
  line-height: 44px; /* Adjusted for vertical alignment */
}

.e48_318 {
  width: 393px;
  height: 46px;
  position: absolute;
  left: 0px;
  top: 50px;
  background-image: url(@/assets/control_top_bar.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
