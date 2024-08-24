<!-- src/components/InitialLoading.vue -->
<template>
  <div class="e3_3" @click="goToWaiting">
    <div class="e16_24"></div>
  </div>
</template>

<script>
export default {
  name: 'InitialLoading',
  methods: {
    goToWaiting() {
      this.$router.push('/waiting');
    },
  },
};
</script>

<style scoped>
.e3_3 {
  overflow: hidden;
  background-color: rgba(255, 255, 255, 1);
  width: 393px;
  height: 852px;
  position: absolute;
  cursor: pointer; /* Changes cursor to pointer to indicate clickable area */
}

.e16_24 {
  width: 393px;
  height: 852px;
  position: absolute;
  left: 0;
  top: 0;
  background-image: url('@/assets/loading.png'); /* Ensure this path is correct */
  background-repeat: no-repeat;
  background-size: cover;
}
</style>