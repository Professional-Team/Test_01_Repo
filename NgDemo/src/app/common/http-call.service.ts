import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HttpCallService {
   httpOptions = {
    headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Access-Control-Allow-Origin': 'https://localhost:8080',
    'Access-Control-Allow-Methods': 'POST, GET, OPTIONS, DELETE'
    })
  };

  constructor(private httpService: HttpClient) { }
  urlPrefix = 'api/'

  public get (url: string) {
    const serviceUrl = this.urlPrefix + url;
    return this.httpService.get(serviceUrl);
  }

  public post (url: string, object: any) {
    const serviceUrl = this.urlPrefix + url;
    return this.httpService.post(serviceUrl, object);
  }
}




