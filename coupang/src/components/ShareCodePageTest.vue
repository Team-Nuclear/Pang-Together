<template>
  <div>
    <h1>Your Share Code</h1>
    <p>Share this code with your friends: <strong>{{ shareCode }}</strong></p>
  </div>
</template>

<script>
export default {
  props: {
    shareCode: {
      type: String,
      required: true
    },
  },
};
</script>

<style scoped>
h1 {
  font-size: 24px;
  margin-bottom: 20px;
}

p {
  font-size: 18px;
}
</style>
