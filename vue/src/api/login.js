import request from '@/utils/request' //�����װ�õ� axios ����

export function login(username, password) { //��¼�ӿ�
    return request({ //ʹ�÷�װ�õ� axios ������������
        url: '/admin/login',
        method: 'post',
        data: { //�ύ������
            username,
            password
        }
    })
}