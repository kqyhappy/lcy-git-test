module.exports = {
    /* �������������Ϳ��������µ�URL���ɶԵ�ǰ�����������֣�baseUrl �� Vue CLI 3.3 �������ã�Ҫʹ��publicPath */
    /* baseUrl: process.env.NODE_ENV === 'production' ? './' : '/' */
    // publicPath: process.env.NODE_ENV === 'production' ? '/public/' : './',
    publicPath: '/',
    /* ����ļ�Ŀ¼����npm run buildʱ�������ļ���Ŀ¼���� */
    outputDir: 'dist',
    /* �������ɵľ�̬��Դ (js��css��img��fonts) �� (����� outputDir ��) Ŀ¼ */
    assetsDir: "assets",
    /* �Ƿ��ڹ���������ʱ���� sourceMap �ļ���false����߹����ٶ� */
    productionSourceMap: false,
    /* Ĭ������£����ɵľ�̬��Դ�����ǵ��ļ����а����� hash �Ա���õĿ��ƻ��棬�����ͨ�������ѡ����Ϊ false ���ر��ļ�����ϣ��(false��ʱ�������ԭ�����ļ������ı�) */
    filenameHashing: false,
    /* ���뱣��ʱ����eslint��� */
    lintOnSave: true,
    /* webpack-dev-server ������� */
    devServer: {
        /* �Զ�������� */
        open: true,
        /* ����Ϊ0.0.0.0�����еĵ�ַ���ܷ��� */
        host: '0.0.0.0',
        port: 8888,
        https: false,
        hotOnly: false,
        /* ʹ�ô��� */
        proxyTable: {
            '/api': {
                target: 'http://localhost:8443',
                changeOrigin: true,
                pathRewrite: {
                    '^/api': ''
                }
            }
        }
    }
}