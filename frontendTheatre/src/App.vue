<template>
<div id="app">  
  <!-- <router-view></router-view> -->
  <choix-spectacle v-if="!selectedSpectacle"></choix-spectacle>
  <choix-places v-if="selectedSpectacle != null"></choix-places>
  {{selectedSpectacle}}
</div>
</template>

<script>
import ChoixSpectacle from './components/commons/ChoixSpectacle'
import ChoixPlaces from './components/commons/ChoixPlaces'

import { mapState } from 'vuex'

export default {
  name: 'App',
  components: { ChoixSpectacle, ChoixPlaces },
  computed: mapState([
    'selectedSpectacle'
  ]),
}
</script>
