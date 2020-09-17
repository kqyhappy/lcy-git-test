import Vue from 'vue' //���� Vue
import VueRouter from 'vue-router' //���� Vue ·��

Vue.use(VueRouter); //��װ���

export const constantRouterMap = [
    //����Ĭ�ϵ�·����Ĭ����ʾ��¼ҳ
    { path: '/', component: () => import('@/views/login')},

    //���õ�¼�ɹ�ҳ�棬ʹ��ʱ��Ҫʹ�� path ·����ʵ����ת
    { path: '/success', component: () => import('@/views/success')},

    //���õ�¼ʧ��ҳ�棬ʹ��ʱ��Ҫʹ�� path ·����ʵ����ת
    { path: '/error', component: () => import('@/views/error'), hidden: true }
]

export default new VueRouter({
    mode: 'history', //���֧�ֿɿ�
    scrollBehavior: () => ({ y: 0 }),
    routes: constantRouterMap //ָ��·���б�
})