<template>
  <div class="e42_145">
    <div class="e42_146"></div>
    <div class="e42_149" @click="goToSearchScreen"></div>
    <div class="e42_147" @click="goToCartHome"></div>
  </div>
</template>

<script>
export default {
  name: 'HomeScreen',
  methods: {
    goToCartHome() {
      this.$router.push('/cart-home');
    },

     goToSearchScreen() {
      this.$router.push('/search');
    },
  },
};
</script>

<style scoped>
.e42_145 { 
	overflow:hidden;
}
.e42_145 { 
	background-color:rgba(255, 255, 255, 1);
	width:393px;
	height:852px;
	position:absolute;
}
.e42_146 { 
	width:393px;
	height:852px;
	position:absolute;
	left:0px;
	top:0px;
	background-image:url(@/assets/home_screen.png); /* Ensure the image path is correct */
	background-repeat:no-repeat;
	background-size:cover;
}
.e42_149 { 
	width:393px;
	height:55px;
	position:absolute;
	left:0px;
	top:92px;
	background-image:url(@/assets/search_bar.png); /* Ensure the image path is correct */
	background-repeat:no-repeat;
	background-size:cover;
}
.e42_147 { 
	width:393px;
	height:80px;
	position:absolute;
	left:0px;
	top:772px;
	background-image:url(@/assets/bottom_bar.png); /* Ensure the image path is correct */
	background-repeat:no-repeat;
	background-size:cover;
}
</style>
