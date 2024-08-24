<template>
  <div class="e16_29">
    <div class="e16_36"></div>
    <div class="e35_97" @click="goToTogetherCartHome">
      <span class="ei35_97_15_382">공유 장바구니</span>
    </div>
  </div>
</template>

<script>
export default {
  name: 'CartHome',
  methods: {
    goToTogetherCartHome() {
      this.$router.push('/together-cart-home');
    },
  },
};
</script>

<style scoped>
.e16_29 { 
	overflow:hidden;
	background-color:rgba(255, 255, 255, 1);
	width:393px;
	height:852px;
	position:absolute;
}

.e16_36 { 
	width:393px;
	height:852px;
	position:absolute;
	left:0px;
	top:0px;
	background-image:url(@/assets/cart_home.png); /* Adjust the path if necessary */
	background-repeat:no-repeat;
	background-size:cover;
}

.e35_97 { 
	background-color:rgba(255, 255, 255, 1);
	width:89px;
	height:19px;
	position:absolute;
	left:294px;
	top:67px;
}

.ei35_97_15_382 { 
	color:rgba(65, 104, 246, 1);
	width:100px;
	height:20px;
	position:absolute;
	left:0px;
	top:0px;
	font-family: "top_button", sans-serif;
	text-align:left;
	font-size:15px;
    font-style: bold;
	letter-spacing:0;
}
</style>
