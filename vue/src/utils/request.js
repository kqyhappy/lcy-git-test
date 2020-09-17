import axios from 'axios' //���� axios
import baseUrl from '../api/baseUrl' //ʹ�û������� + ģʽ�ķ�ʽ�������URL

// ���� axios ʵ��
const service = axios.create({
    baseURL: baseUrl, // api �� base_url
    timeout: 15000, // ����ʱʱ��
})

export default service