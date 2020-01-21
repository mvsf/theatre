// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import Vuex from 'vuex'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import VueRouter from 'vue-router'

import App from './App'
import Home from './components/layout/Home'
import store from './components/store/store.js'

Vue.config.productionTip = false
Vue.use(BootstrapVue)
Vue.use(VueRouter)
Vue.use(Vuex)

const routes = [  
  { path: '/', component: Home },
]
const router = new VueRouter({
  routes 
})

new Vue({
  router,
  store,
  el: '#app',
  components: { App },
  template: '<App/>'
})
