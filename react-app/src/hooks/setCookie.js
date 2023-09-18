import Cookie from 'js-cookie';

const SetCookie = (cookiename, input)=>{
    Cookie.set(cookiename, input,{
            expires:1,
            secure:true,
            sameSite:'strict',
            path:'/'
        });
};
export default SetCookie;