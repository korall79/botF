package com.example.botf.configuration;

import com.example.botf.bot.ExchangeRatesBot;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class ExchangeRatesBotConfiguration {
    @Bean
    public TelegramBotsApi telegramBotsApi (ExchangeRatesBot exchangeRatesBot) throws TelegramApiException{
        var api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(exchangeRatesBot);
        return api;
    }
    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }

}
