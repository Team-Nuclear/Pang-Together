<template>
  <div class="e42_232">
    <div class="e42_233"></div>
    <div class="e42_234" @click="goToSearchResult"></div>
  </div>
</template>

<script>
export default {
  name: 'SearchScreen',
  methods: {
    goToSearchResult() {
      this.$router.push('/search-result');
    },
  },
};
</script>

<style scoped>
.e42_232 {
  overflow: hidden;
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 852px;
  position: absolute;
}

.e42_233 {
  width: 393px;
  height: 852px;
  position: absolute;
  left: 0px;
  top: 0px;
  background-image: url(@/assets/searching_image.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}

.e42_234 {
  width: 393px;
  height: 56px;
  position: absolute;
  left: 0px; /* Adjusted for simplicity */
  top: 45px;
  background-image: url(@/assets/searching_bar.png); /* Adjust the path if necessary */
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
