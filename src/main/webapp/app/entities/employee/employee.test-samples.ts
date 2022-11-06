import dayjs from 'dayjs/esm';

import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 7813,
};

export const sampleWithPartialData: IEmployee = {
  id: 94038,
  lastName: 'Carvalho',
  email: 'Karla.Albuquerque@hotmail.com',
  hireDate: dayjs('2022-11-06T18:07'),
  commissionPct: 14006,
};

export const sampleWithFullData: IEmployee = {
  id: 50464,
  firstName: 'Ígor',
  lastName: 'Macedo',
  email: 'Salvador97@yahoo.com',
  phoneNumber: 'do',
  hireDate: dayjs('2022-11-05T21:07'),
  salary: 20712,
  commissionPct: 36931,
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
