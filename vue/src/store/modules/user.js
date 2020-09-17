import { login } from '@/api/login'//�����¼ api �ӿ�

const user = {
    actions: {
        // ��¼
        Login({ commit }, userInfo) { //���� Login �������������ʹ�� this.$store.dispatch("Login") ����
            const username = userInfo.username.trim()
            return new Promise((resolve, reject) => { //��װһ�� Promise
                login(username, userInfo.password).then(response => { //ʹ�� login �ӿڽ�����������
                    commit('') //�ύһ�� mutation��֪ͨ״̬�ı�
                    resolve(response) //�������װ�� Promise
                }).catch(error => {
                    reject(error)
                })
            })
        },
    }
}
export default user


