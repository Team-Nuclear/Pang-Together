<template>
  <div class="e88_138">
    <div class="e42_124"></div>
    <div class="e42_126"></div>
    <div class="e42_141"></div>
    <div class="e42_179">
        <input
            v-model="cart.shareCode"
            type="text"
            style="width:300px; height: 60px; margin-top: 50px; font-size:25px; text-align:center"
        />
    </div>
    <div class="e88_135" @click="goToHome"></div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      cart: '',
    };
  },  
  name: 'TogetherCartStart',
  methods: {
    goToHome() {
      this.$router.push('/home');
    },
  },
    created() {
    const url = 'http://localhost:8080/api'; // Replace with your API endpoint
    const name = 'testUser999';
    const createdAt = '2024-08-25 02:34:01';
    const status = "ACTIVE";
    const paymentType = "SINGLE";
    const cartCategory = "FOOD";
     axios
      .post(url+"/carts?name="+name+"&createdAt="+createdAt+"&status="+status+"&paymentType="+paymentType+"&cartCategory="+cartCategory, {
      })
      .then((res) => {
        this.cart = res.data;
        console.log(this.cart);
      })
      .catch((err) => {
        console.log(err);
        this.check = 'error';
      });
  }
};
</script>

<style scoped>
.e88_138 { 
	background-color: rgba(255, 255, 255, 1);
	width: 393px;
	height: 852px;
	position: absolute;
}

.e42_124 { 
	width: 393px;
	height: 852px;
	position: absolute;
	left: 0px;
	top: 0px;
	background-image: url(@/assets/home_screen.png); /* Adjust the path if necessary */
	background-repeat: no-repeat;
	background-size: cover;
}

/* .e42_125 { 
	background-color:rgba(255, 255, 255, 1);
	width:89px;
	height:19px;
	position:absolute;
	left:294px;
	top:67px;
}

.ei42_125_15_382 { 
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
} */

.e42_126 { 
	width:393px;
	height:630px;
	position:absolute;
	left:0px;
	top:137px;
	background-image:url(@/assets/cart_location.png); /* Adjust the path if necessary */
	background-repeat:no-repeat;
	background-size:cover;
}

.e42_141 { 
    width:393px;
	height:47px;
	position:absolute;
	left:0px;
	top:720px;
	background-image:url(@/assets/together_cart_start.png); /* Adjust the path if necessary */
	background-repeat:no-repeat;
	background-size:cover;
}

.e42_179 { 
	width: 393px;
	height: 360px;
	position: absolute;
	left: 0px;
	top: 350px;
	background-image: url(@/assets/share_code_image.png); /* Adjust the path if necessary */
	background-repeat: no-repeat;
	background-size: cover;
}

.e88_135 { 
	width: 44px;
	height: 55px;
	position: absolute;
	left: 350px;
	top: 130px;
	background-image: url(@/assets/x_logo.png); /* Adjust the path if necessary */
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
