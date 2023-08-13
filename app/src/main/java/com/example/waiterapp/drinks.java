package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class drinks extends AppCompatActivity {
    Button submit3,back3,limca_1,limca_2,fizz_1,fizz_2,coke_1,coke_2,thumbsup_1,thumbsup_2,sprite_1,sprite_2,frooti_1,frooti_2,maaza_1,maaza_2,fanta_1,fanta_2;
    TextView limcaval,fizzval,cokeval,thumbsupval,spriteval,frootival,maazaval,fantaval;
    itemdetails limca,fizz,coke,thumbsup,sprite,frooti,maaza,fanta;
    int flag[]={0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        submit3 = (Button) findViewById(R.id.submit3);
        back3= (Button) findViewById(R.id.back3);
        limcaval = (TextView) findViewById(R.id.limcaval);
        fizzval = (TextView) findViewById(R.id.fizzval);
        cokeval = (TextView) findViewById(R.id.cokeval);
        thumbsupval = (TextView) findViewById(R.id.thumbsupval);
        spriteval = (TextView) findViewById(R.id.spriteval);
        frootival = (TextView) findViewById(R.id.frootival);
        maazaval = (TextView) findViewById(R.id.maazaval);
        fantaval = (TextView) findViewById(R.id.fantaval);
        limca_1 = (Button) findViewById(R.id.limca_1);
        limca_2 = (Button) findViewById(R.id.limca_2);
        fizz_1 = (Button) findViewById(R.id.fizz_1);
        fizz_2 = (Button) findViewById(R.id.fizz_2);
        coke_1 = (Button) findViewById(R.id.coke_1);
        coke_2 = (Button) findViewById(R.id.coke_2);
        thumbsup_1 = (Button) findViewById(R.id.thumbsup_1);
        thumbsup_2 = (Button) findViewById(R.id.thumbsup_2);
        sprite_1 = (Button) findViewById(R.id.sprite_1);
        sprite_2 = (Button) findViewById(R.id.sprite_2);
        frooti_1 = (Button) findViewById(R.id.frooti_1);
        frooti_2 = (Button) findViewById(R.id.frooti_2);
        maaza_1 = (Button) findViewById(R.id.maaza_1);
        maaza_2 = (Button) findViewById(R.id.maaza_2);
        fanta_1 = (Button) findViewById(R.id.fanta_1);
        fanta_2 = (Button) findViewById(R.id.fanta_2);
        limca=new itemdetails();
        fizz=new itemdetails();
        coke= new itemdetails();
        thumbsup=new itemdetails();
        sprite=new itemdetails();
        frooti=new itemdetails();
        maaza = new itemdetails();
        fanta = new itemdetails();

        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sender3=new Intent(drinks.this,Display_1.class);
                int j=1;
                for(int i=0;i<8;i++){
                    if(flag[i]==1){
                        switch (i){
                            case 0:
                                sender3.putExtra("item"+j,"Limca");
                                sender3.putExtra("qty"+j,String.valueOf(limca.qty));
                                ++j;
                                break;
                            case 1:
                                sender3.putExtra("item"+j,"Fizz");
                                sender3.putExtra("qty"+j,String.valueOf(fizz.qty));
                                ++j;
                                break;
                            case 2:
                                sender3.putExtra("item"+j,"Coke");
                                sender3.putExtra("qty"+j,String.valueOf(coke.qty));
                                ++j;
                                break;
                            case 3:
                                sender3.putExtra("item"+j,"Sprite");
                                sender3.putExtra("qty"+j,String.valueOf(sprite.qty));
                                ++j;
                                break;
                            case 4:
                                sender3.putExtra("item"+j,"Thumbs UP");
                                sender3.putExtra("qty"+j,String.valueOf(thumbsup.qty));
                                ++j;
                                break;
                            case 5:
                                sender3.putExtra("item"+j,"Frooti");
                                sender3.putExtra("qty"+j,String.valueOf(frooti.qty));
                                ++j;
                                break;
                            case 6:
                                sender3.putExtra("item"+j,"Maaza");
                                sender3.putExtra("qty"+j,String.valueOf(maaza.qty));
                                ++j;
                                break;
                            case 7:
                                sender3.putExtra("item"+j,"Fanta");
                                sender3.putExtra("qty"+j,String.valueOf(fanta.qty));
                                ++j;
                                break;
                        }
                    }
                }

                startActivity(sender3);
            }
        });
        back3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(drinks.this, Category.class);
                startActivity(intent);
            }
        });
        limca_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (limca.qty!=0){
                    limca.qty=limca.qty-1;
                    limcaval.setText(String.valueOf(limca.qty));
                }
                if(limca.qty==0){
                    flag[0]=0;
                }
            }
        });
        limca_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                limca.qty=limca.qty+1;
                limcaval.setText(String.valueOf(limca.qty));
                if(flag[0]==0){
                    flag[0]=1;
                }

            }
        });
        fizz_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (fizz.qty!=0){
                    fizz.qty=fizz.qty-1;
                    fizzval.setText(String.valueOf(fizz.qty));
                }
                if(fizz.qty==0){
                    flag[1]=0;
                }

            }
        });
        fizz_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                fizz.qty=fizz.qty+1;
                fizzval.setText(String.valueOf(fizz.qty));
                if(flag[1]==0){
                    flag[1]=1;
                }

            }
        });
        coke_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (coke.qty!=0){
                    coke.qty=coke.qty-1;
                    cokeval.setText(String.valueOf(coke.qty));
                }
                if(coke.qty==0){
                    flag[2]=0;
                }
            }
        });
        coke_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                coke.qty=coke.qty+1;
                cokeval.setText(String.valueOf(coke.qty));
                if(flag[2]==0){
                    flag[2]=1;
                }

            }
        });
        thumbsup_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (thumbsup.qty!=0){
                    thumbsup.qty=thumbsup.qty-1;
                    thumbsupval.setText(String.valueOf(thumbsup.qty));
                }
                if(thumbsup.qty==0){
                    flag[3]=0;
                }

            }
        });
        thumbsup_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                thumbsup.qty=thumbsup.qty+1;
                thumbsupval.setText(String.valueOf(thumbsup.qty));
                if(flag[3]==0){
                    flag[3]=1;
                }

            }
        });
        sprite_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (sprite.qty!=0){
                    sprite.qty=sprite.qty-1;
                    spriteval.setText(String.valueOf(sprite.qty));
                }
                if(sprite.qty==0){
                    flag[4]=0;
                }

            }
        });
        sprite_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sprite.qty=sprite.qty+1;
                spriteval.setText(String.valueOf(sprite.qty));
                if(flag[4]==0){
                    flag[4]=1;
                }

            }
        });
        frooti_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (frooti.qty!=0){
                    frooti.qty=frooti.qty-1;
                    frootival.setText(String.valueOf(frooti.qty));
                }
                if(frooti.qty==0){
                    flag[5]=0;
                }

            }
        });
        frooti_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                frooti.qty=frooti.qty+1;
                frootival.setText(String.valueOf(frooti.qty));
                if(flag[5]==0){
                    flag[5]=1;
                }

            }
        });
        maaza_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (maaza.qty!=0){
                    maaza.qty=maaza.qty-1;
                    maazaval.setText(String.valueOf(maaza.qty));
                }
                if(maaza.qty==0){
                    flag[6]=0;
                }

            }
        });
        maaza_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                maaza.qty=maaza.qty+1;
                maazaval.setText(String.valueOf(maaza.qty));
                if(flag[6]==0){
                    flag[6]=1;
                }

            }
        });
        fanta_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (fanta.qty!=0){
                    fanta.qty=frooti.qty-1;
                    fantaval.setText(String.valueOf(fanta.qty));
                }
                if(fanta.qty==0){
                    flag[7]=0;
                }

            }
        });
        fanta_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                fanta.qty=fanta.qty+1;
                fantaval.setText(String.valueOf(fanta.qty));
                if(flag[7]==0){
                    flag[7]=1;
                }

            }
        });
    }
}
