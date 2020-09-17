import Vue from 'vue' //���� Vue
import Vuex from 'vuex' //���� Vuex
import user from './modules/user' //���� user module

Vue.use(Vuex)

const store = new Vuex.Store({
    modules: {
        user //ʹ�� user.js �е� action
    }
})

export default store