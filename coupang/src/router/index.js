import { createRouter, createWebHistory } from 'vue-router';

import CartForm from '../components/CartTest.vue';
import ShareCodePage from '../components/ShareCodePageTest.vue';

// Define routes
const routes = [
  { path: '/', component: CartForm },
  { path: '/share-code', component: ShareCodePage, props: route => ({ shareCode: route.params.shareCode }) },
];

// Create the router instance
const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;