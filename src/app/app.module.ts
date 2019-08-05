import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AspComponent } from './asp/asp.component';
import { RcStatusComponent } from './rc-status/rc-status.component';
import { StateComponent } from './state/state.component';
import { CityComponent } from './city/city.component';
import { AreaComponent } from './area/area.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AspComponent,
    RcStatusComponent,
    StateComponent,
    CityComponent,
    AreaComponent,
    AdminDashboardComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:"admin/dashboard",component:AdminDashboardComponent},
      {path:"admin/user",component:UserComponent},
      {path:"admin/asp",component:AspComponent},
      {path:"admin/state",component:StateComponent},
      {path:"admin/city",component:CityComponent},
      {path:"admin/area",component:AreaComponent},
      {path:"admin/rules",component:RcStatusComponent},
    ])
  ],
  providers: [{provide: LocationStrategy,useClass: HashLocationStrategy}],
  bootstrap: [AppComponent]
})
export class AppModule { }
