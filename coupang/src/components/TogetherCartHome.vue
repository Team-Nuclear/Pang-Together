<template>
  <div class="e35_87">
    <div class="e35_88"></div>
    <div class="e35_110">
      <span class="ei35_110_15_382">공유 장바구니</span>
    </div>
    <div class="e16_1577"></div>
    <div class="e42_139" @click="goToTogetherCartStart"></div>
  </div>
</template>

<script>

export default {
  name: 'TogetherCartHome',
  methods: {
    goToTogetherCartStart() {
      this.$router.push('/together-cart-start');
    },
  },

};
</script>

<style scoped>
.e35_87 { 
	overflow:hidden;
	background-color:rgba(255, 255, 255, 1);
	width:393px;
	height:852px;
	position:absolute;
}

.e35_88 { 
	width:393px;
	height:852px;
	position:absolute;
	left:0px;
	top:0px;
	background-image:url(@/assets/cart_home.png); /* Adjust the path if necessary */
	background-repeat:no-repeat;
	background-size:cover;
}

.e35_110 { 
	background-color:rgba(255, 255, 255, 1);
	width:89px;
	height:19px;
	position:absolute;
	left:294px;
	top:67px;
}

.ei35_110_15_382 { 
	color:rgba(65, 104, 246, 1);
	width:100px;
	height:20px;
	position:absolute;
	left:0px;
	top:0px;
	font-family: 'Inter', sans-serif;
	text-align:left;
	font-size:15px;
	letter-spacing:0;
}

.e16_1577 { 
	width:393px;
	height:630px;
	position:absolute;
	left:0px;
	top:137px;
	background-image:url(@/assets/cart_location.png); /* Adjust the path if necessary */
	background-repeat:no-repeat;
	background-size:cover;
}

.e42_139 { 
	width:393px;
	height:47px;
	position:absolute;
	left:0px;
	top:720px;
	background-image:url(@/assets/together_cart_start.png); /* Adjust the path if necessary */
	background-repeat:no-repeat;
	background-size:cover;
}
</style>
