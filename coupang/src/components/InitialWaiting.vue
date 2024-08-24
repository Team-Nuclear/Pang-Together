<template>
  <div class="e16_27">
    <div class="e16_32" @click="goToHome"></div>
    <div class="e24_87"></div>
  </div>
</template>

<script>
export default {
  name: 'InitialWaiting',
  methods: {
    goToHome() {
      this.$router.push('/home');
    },
  },
};
</script>

<style scoped>
.e16_27 { 
	overflow:hidden;
	background-color:rgba(255, 255, 255, 1);
	width:393px;
	height:852px;
	position:absolute;
}

.e16_32 { 
	width:393px;
	height:852px;
	position:absolute;
	left:0px;
	top:0px;
	background-image:url(@/assets/initial_waiting.png);
	background-repeat:no-repeat;
	background-size:cover;
	cursor: pointer; /* Indicates that the area is clickable */
}

.e24_87 { 
	width:393px;
	height:469px;
	position:absolute;
	left:0px;
	top:287px;
	background-image:url(@/assets/initial_chicken.png);
	background-repeat:no-repeat;
	background-size:cover;
}
</style>
