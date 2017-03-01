//package com.gilcu2.realmtestkotlin
//
///**
// * Created by gilcu2 on 3/1/17.
// */
//
//import io.realm.Realm
//import io.realm.log.RealmLog
//import org.hamcrest.CoreMatchers
//import org.junit.Assert
//
//import org.junit.Test
//import org.junit.Before
//import org.junit.Rule
//
//import org.mockito.Mockito.`when`
//import org.powermock.api.mockito.PowerMockito
//import org.powermock.modules.junit4.rule.PowerMockRule
//
//class DBTest {
//
//    @get: Rule
//    val rule = PowerMockRule()
//
//    lateinit internal var mockRealm: Realm
//
//    @Before
//    fun setup() {
//        PowerMockito.mockStatic(RealmLog::class.java)
//        PowerMockito.mockStatic(Realm::class.java)
//
//        val mockRealm = PowerMockito.mock(Realm::class.java)
//
//        `when`(Realm.getDefaultInstance()).thenReturn(mockRealm)
//
//        this.mockRealm = mockRealm
//    }
//
//    @Test
//    fun shouldBeAbleToGetDefaultInstance() {
//        Assert.assertThat(Realm.getDefaultInstance(), CoreMatchers.`is`(mockRealm))
//    }
//
//}