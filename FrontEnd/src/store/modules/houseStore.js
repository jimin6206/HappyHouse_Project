// import http from "@/common/axios.js";

// const houseStore = {
//   state: {
//     address: {
//       sidoList: [],
//       sido: "0", // 최초 선택 항목 지정
//       gugunList: [],
//       gugun: "0",
//       dongList: [],
//       dong: "0",
//     },
//   },
//   // state 상태를 변경하는 유일한 방법
//   mutations: {
//     SET_ADDRESS_SIDOlIST(state, payload) {
//       state.address.sidoList = payload;
//     },
//     SET_ADDRESS_GUGUNlIST(state, payload) {
//       state.address.gugunList = payload;
//     },
//     SET_ADDRESS_DONGlIST(state, payload) {
//       state.address.dongList = payload;
//     },

//     SET_ADDRESS_SIDO(state, payload) {
//       state.address.sido = payload;

//       state.address.gugun = "0";
//       state.address.dong = "0";
//       state.address.gugunList = [];
//       state.address.dongList = [];
//     },
//     SET_ADDRESS_GUGUN(state, payload) {
//       state.address.gugun = payload;

//       state.address.dong = "0";
//       state.address.dongList = [];
//     },
//     SET_ADDRESS_DONG(state, payload) {
//       state.address.dong = payload;
//     },
//   },
//   // for async method
//   actions: {
//     async getSidoList(context) {
//       try {
//         let { data } = await http.get("/sido");
//         context.commit("SET_ADDRESS_SIDOlIST", data);
//       } catch (error) {
//         console.log(error);
//       }
//     },
//     async getGugunList(context) {
//       try {
//         let { data } = await http.get("/gugun/" + this.state.address.sido);
//         console.log(data);
//         context.commit("SET_ADDRESS_GUGUNlIST", data);
//       } catch (error) {
//         console.log(error);
//       }
//     },
//     async getDongList(context) {
//       try {
//         let { data } = await http.get("/dong/" + this.state.address.gugun);
//         console.log(data);
//         context.commit("SET_ADDRESS_DONGlIST", data);
//       } catch (error) {
//         console.log(error);
//       }
//     },
//   },
//   getters: {
//     getSidoList(state) {
//       return state.address.sidoList;
//     },
//     getGugunList(state) {
//       return state.address.gugunList;
//     },
//     getDongList(state) {
//       return state.address.dongList;
//     },

//     getSido(state) {
//       return state.address.sido;
//     },
//     getGugun(state) {
//       return state.address.gugun;
//     },
//     getDong(state) {
//       return state.address.dong;
//     },
//   },
// };

// export default houseStore;
