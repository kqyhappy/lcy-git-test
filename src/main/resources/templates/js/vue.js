new Vue({
    el: '#app',
    data: function() {
        return { visible: false }
    }
}),
    new Vue({
        el: '#app2',
        data: {
            message: 'Hi',
            message2: 'ҳ������� ' + new Date().toLocaleString(),
            todos:[
                {text:"����"},
                {text:"�㷨ѵ��"},
                {text:"����ѵ��"}
            ],
            seen: true
        },
        methods:{
            reverseMessage: function () {
                this.message = this.message.split('').reverse().join('')
            }
        }
    })