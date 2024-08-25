// src/router/index.js
import { createRouter, createWebHistory } from 'vue-router';
import InitialLoading from '@/components/InitialLoading.vue';
import InitialWaiting from '@/components/InitialWaiting.vue';
import HomeScreen from '@/components/HomeScreen.vue';
import CartHome from '@/components/CartHome.vue';
import TogetherCartHome from '@/components/TogetherCartHome.vue';
import TogetherCartStart from '@/components/TogetherCartStart.vue';
import SearchScreen from '@/components/SearchScreen.vue';
import SearchResult from '@/components/SearchResult.vue';
import SearchResultAfterAdd from '@/components/SearchResultAfterAdd.vue';
import HomeScreenAfterCart from '@/components/HomeScreenAfterCart.vue';
import TogetherCartList from '@/components/TogetherCartList.vue';
import PaymentInitial from '@/components/PaymentInitial.vue';
import ChatScreen from '@/components/ChatScreen.vue';

const routes = [
  { path: '/', component: InitialLoading },
  { path: '/waiting', component: InitialWaiting },
  { path: '/home', component: HomeScreen },
  { path: '/cart-home', component: CartHome },
  { path: '/together-cart-home', component: TogetherCartHome },
  { path: '/together-cart-start', component: TogetherCartStart },
  { path: '/search', component: SearchScreen },
  { path: '/search-result', component: SearchResult },
  { path: '/search-result-after-add', component: SearchResultAfterAdd },
  { path: '/home-after-cart', component: HomeScreenAfterCart },
  { path: '/cart-list', component: TogetherCartList },
  { path: '/pay-initial', component: PaymentInitial },
  { path: '/chat', component: ChatScreen },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
