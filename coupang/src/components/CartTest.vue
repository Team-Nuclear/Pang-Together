<template>
  <div>
    <h1>Create a Cart</h1>
    <button @click="createCart">Create Cart</button>

    <!-- Display the share code if available -->
    <div v-if="shareCode">
      <h2>Share Code: {{ shareCode }}</h2>
      <p>Use this code to share the cart with your friends.</p>
    </div>
  </div>
</template>

<script>
// import axios from 'axios';

export default {
  data() {
    return {
      shareCode: null,
    };
  },
  methods: {
    async createCart() {
      try {
        // const cartData = {
        //   name: "친구들과 장보기",
        //   creatorNickname: "민지",
        //   paymentType: "SPLIT",
        // };

        // const response = await axios.post('/api/carts', cartData);
        // this.shareCode = response.data.shareCode;
        this.shareCode = "1111111";

        // Navigate to the ShareCodePage
        this.$router.push({ name: 'ShareCodePage', params: { shareCode: this.shareCode } });
      } catch (error) {
        console.error('Error creating cart:', error);
      }
    },
  },
};
</script>

<style scoped>
button {
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
  margin-top: 20px;
}

h2 {
  margin-top: 20px;
  color: green;
}
</style>
